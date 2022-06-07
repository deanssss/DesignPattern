package xyz.dean.practice.design_pattern.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable {
    private Singleton() {
        System.out.println("new instance");
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    public static void hello() {

    }

    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }

    private Object readResolve() throws ObjectStreamException {
        return SingletonHolder.instance;
    }
}