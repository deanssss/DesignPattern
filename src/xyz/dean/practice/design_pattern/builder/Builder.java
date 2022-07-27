package xyz.dean.practice.design_pattern.builder;

public interface Builder {
    void reset();
    void buildStepA();
    void buildStepB();
    void buildStepZ();
}
