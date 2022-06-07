package xyz.dean.practice.design_pattern.state;

public class Context {
    private State state;

    public Context(State initialState) {
        this.state = initialState;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void doThis() {
        state.doThis();
    }

    public void doThat() {
        state.doThat();
    }
}
