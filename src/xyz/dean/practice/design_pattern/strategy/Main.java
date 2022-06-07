package xyz.dean.practice.design_pattern.strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        Strategy strategy = new ConcreteStrategy();
        context.setStrategy(strategy);
        context.doSomething();
    }
}
