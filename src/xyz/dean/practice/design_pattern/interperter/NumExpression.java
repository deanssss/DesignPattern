package xyz.dean.practice.design_pattern.interperter;

public class NumExpression extends ArithmeticExpression {
    private final int num;
    public NumExpression(int num) { this.num = num; }

    @Override
    public int interpret() { return num; }
}
