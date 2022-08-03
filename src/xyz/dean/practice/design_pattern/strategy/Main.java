package xyz.dean.practice.design_pattern.strategy;

public class Main {
public static void main(String[] args) {
    Context context = new Context();
    context.addStrategy('+', new ConcreteStrategyAdd());
    context.addStrategy('-', new ConcreteStrategySubtract());
    context.addStrategy('*', new ConcreteStrategyMultiply());

    context.doSomething(1, 2, '+');
    context.doSomething(1, 2, '-');
    context.doSomething(1, 2, '*');
    context.doSomething(1, 2, '/');
}
}
