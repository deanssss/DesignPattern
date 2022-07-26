package xyz.dean.practice.design_pattern.singleton;

public class SyncMethodSingleton {
    private SyncMethodSingleton() {
    }

    void hello() {
        System.out.println("synchronized method singleton instance.");
    }

    private static SyncMethodSingleton instance;

    public static synchronized SyncMethodSingleton getInstance() {
        if (instance == null) {
            instance = new SyncMethodSingleton();
        }
        return instance;
    }
}
