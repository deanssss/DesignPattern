package xyz.dean.practice.design_pattern.singleton;

public enum SingletonEnum {
    INSTANCE;

    SingletonEnum() {
        System.out.println("new instance");
    }

    public static void hello() {}
}
