package xyz.dean.practice.design_pattern.strategy;

public class ConcreteStrategyMultiply implements Strategy {
    @Override
    public int execute(int a, int b) { return a * b; }
}
