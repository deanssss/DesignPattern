package xyz.dean.practice.design_pattern.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class InnerClassSingleton implements Serializable {
    private InnerClassSingleton() {
    }

    void hello() {
        System.out.println("inner class singleton instance.");
    }

    public static InnerClassSingleton getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static final InnerClassSingleton instance = new InnerClassSingleton();
    }

    private Object readResolve() throws ObjectStreamException {
        return SingletonHolder.instance;
    }
}