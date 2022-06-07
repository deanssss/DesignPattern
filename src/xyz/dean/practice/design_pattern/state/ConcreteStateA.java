package xyz.dean.practice.design_pattern.state;

public class ConcreteStateA implements State {
    private Context context;

    public ConcreteStateA(Context context) {
        this.context = context;
    }

    @Override
    public void doThis() {
        System.out.println("do this...");
        context.changeState(new ConcreteStateB(context));
    }

    @Override
    public void doThat() {
        System.out.println("You can not do that.");
    }
}
