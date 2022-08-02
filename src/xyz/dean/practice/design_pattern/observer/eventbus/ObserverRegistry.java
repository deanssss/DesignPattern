package xyz.dean.practice.design_pattern.observer.eventbus;

import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Collectors;

public class ObserverRegistry {
    private static final Map<Class<?>, Class<?>> typeMapper = new HashMap<>();
    static {
        typeMapper.put(boolean.class, Boolean.class);
        typeMapper.put(byte.class, Byte.class);
        typeMapper.put(char.class, Character.class);
        typeMapper.put(short.class, Short.class);
        typeMapper.put(int.class, Integer.class);
        typeMapper.put(long.class, Long.class);
        typeMapper.put(float.class, Float.class);
        typeMapper.put(double.class, Double.class);
    }

    private final ConcurrentMap<Class<?>, CopyOnWriteArraySet<ObserverAction>> register = new ConcurrentHashMap<>();

    public void register(Object observer) {
        findAllObserverAction(observer)
                .forEach((eventType, actions) -> {
                    CopyOnWriteArraySet<ObserverAction> registeredActions = register.get(eventType);
                    if (registeredActions == null) {
                        register.putIfAbsent(eventType, new CopyOnWriteArraySet<>());
                        registeredActions = register.get(eventType);
                    }
                    registeredActions.addAll(actions);
                });
    }

    private Map<Class<?>, Collection<ObserverAction>> findAllObserverAction(Object observer) {
        Map<Class<?>, Collection<ObserverAction>> actions = new HashMap<>();
        getAnnotatedMethods(observer.getClass())
                .forEach(method -> {
                    Class<?> eventType = method.getParameterTypes()[0];
                    Class<?> boxType = typeMapper.get(eventType);
                    eventType = boxType == null ? eventType : boxType;
                    if (!actions.containsKey(eventType)) {
                        actions.put(eventType, new ArrayList<>());
                    }
                    actions.get(eventType).add(new ObserverAction(observer, method));
                });
        return actions;
    }

    private List<Method> getAnnotatedMethods(Class<?> clazz) {
        List<Method> methods = new ArrayList<>();
        for (Method method: clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Subscribe.class)) {
                Class<?>[] paramTypes = method.getParameterTypes();
                if (paramTypes.length != 1) {
                    String errMsg = "Method " + method + " has @Subscribe annotation but has " + paramTypes.length + " parameters."
                            + " Subscriber methods must have exactly 1 parameter.";
                    throw new IllegalStateException(errMsg);
                }
                methods.add(method);
            }
        }
        return methods;
    }

    public List<ObserverAction> matchObserverActions(Object event) {
        Class<?> eventType = event.getClass();
        return register.entrySet().stream()
                .filter(e -> eventType.isAssignableFrom(e.getKey()))
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.toList());
    }
}
