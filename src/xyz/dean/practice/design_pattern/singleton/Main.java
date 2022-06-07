package xyz.dean.practice.design_pattern.singleton;

public class Main {

    public static void main(String[] args) {
        Singleton.hello();
        System.out.println("after hello");
        Singleton.getInstance();

        SingletonEnum.hello();
        System.out.println("after hello");
        SingletonEnum.INSTANCE.name();
    }
}
