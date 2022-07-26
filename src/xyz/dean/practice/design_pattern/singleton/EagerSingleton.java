package xyz.dean.practice.design_pattern.singleton;

public class EagerSingleton {
    private EagerSingleton() {
    }

    void hello() {
        System.out.println("eager singleton instance.");
    }

    private static final EagerSingleton instance = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return instance;
    }
}
