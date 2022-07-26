package xyz.dean.practice.design_pattern.singleton;

public class DCLSingleton {
    private DCLSingleton() {
    }

    void hello() {
        System.out.println("double check lock singleton instance.");
    }

    private static volatile DCLSingleton instance;

    public static DCLSingleton getInstance() {
        // volatile变量使用时需要直接访问主存，开销较大，因此使用局部变量以提升性能。
        DCLSingleton temp = instance;
        if (temp == null) {
            synchronized (DCLSingleton.class) {
                //noinspection ConstantConditions
                if (temp == null) {
                    temp = new DCLSingleton();
                    instance = temp;
                }
            }
        }
        return instance;
    }
}
