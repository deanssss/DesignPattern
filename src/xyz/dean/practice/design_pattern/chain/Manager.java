package xyz.dean.practice.design_pattern.chain;

public class Manager extends Leader {
    @Override
    protected int limit() { return 10000; }

    @Override
    protected void handle(int money) {
        System.out.println("经理批复报销" + money + "元");
    }
}
