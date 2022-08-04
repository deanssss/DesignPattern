package xyz.dean.practice.design_pattern.chain;

public class Boss extends Leader {
    @Override
    protected int limit() { return 100000; }

    @Override
    protected void handle(int money) {
        System.out.println("老板批复报销" + money + "元");
    }
}
