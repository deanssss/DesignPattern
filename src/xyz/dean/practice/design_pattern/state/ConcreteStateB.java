package xyz.dean.practice.design_pattern.state;

public class ConcreteStateB implements State {
    private Context context;

    public ConcreteStateB() {
    }

    @Override
    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public void doThis() {
        System.out.println("You can not do this.");
    }

    @Override
    public void doThat() {
        System.out.println("do that...");
        context.changeState(new ConcreteStateA());
    }
}
