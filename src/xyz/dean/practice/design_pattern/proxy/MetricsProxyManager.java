package xyz.dean.practice.design_pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MetricsProxyManager {
    @SuppressWarnings("unchecked")
    public <T> T createProxy(T object, Class<T> clazz) {
        Class<?>[] interfaces = clazz.getInterfaces();
        InvocationHandler handler = new MetricsProxyHandler(object);
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(), interfaces, handler);
    }

    public static class MetricsProxyHandler implements InvocationHandler {
        private final Object proxied;

        public MetricsProxyHandler(Object proxied) {
            this.proxied = proxied;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            long startTime = System.nanoTime();
            Object result = method.invoke(proxied, args);
            long endTime = System.nanoTime();
            System.out.println("invoke method: " + method.getName() + ", spend: " + (endTime - startTime) + "ns.");
            return result;
        }
    }
}
