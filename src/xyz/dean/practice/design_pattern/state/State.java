package xyz.dean.practice.design_pattern.state;

public interface State {
    void setContext(Context context);
    void doThis();
    void doThat();
}
