package xyz.dean.practice.design_pattern.singleton;

import java.util.HashMap;
import java.util.Map;

public class SingletonManager {
    private static final Map<String, Object> instanceMap = new HashMap<>();

    private SingletonManager() {
    }

    public static void registerService(String key, Object instance) {
        if (!instanceMap.containsKey(key)) {
            instanceMap.put(key, instance);
        }
    }

    public static Object getService(String key) {
        return instanceMap.get(key);
    }
}