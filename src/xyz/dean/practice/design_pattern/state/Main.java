package xyz.dean.practice.design_pattern.state;

public class Main {
    public static void main(String[] args) {
        ConcreteStateA initialState = new ConcreteStateA();
        Context context = new Context(initialState);

        context.printCurrentState();
        context.doThis();
        context.printCurrentState();
        context.doThat();
        context.printCurrentState();
        context.doThis();
        context.doThis();
        context.printCurrentState();
    }
}
