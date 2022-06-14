package xyz.dean.practice.design_pattern.state;

public class Context {
    private State state;

    public Context(State initialState) {
        this.state = initialState;
    }

    public void changeState(State state) {
        state.setContext(this);
        this.state = state;
    }

    public void doThis() {
        state.doThis();
    }

    public void doThat() {
        state.doThat();
    }

    public void printCurrentState() {
        if (state instanceof ConcreteStateA) {
            System.out.println("Current state is State A.");
        } else {
            System.out.println("Current state is State B.");
        }
    }
}
