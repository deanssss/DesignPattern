package xyz.dean.practice.design_pattern.singleton;

public class Main {
    void hello() {
        System.out.println("instance main.");
    }

    public static void main(String[] args) {
        EagerSingleton.getInstance().hello();
        SyncMethodSingleton.getInstance().hello();
        DCLSingleton.getInstance().hello();
        InnerClassSingleton.getInstance().hello();
        SingletonEnum.INSTANCE.hello();

        Main main = new Main();
        SingletonManager.registerService("main", main);
        ((Main) SingletonManager.getService("main")).hello();
    }
}
