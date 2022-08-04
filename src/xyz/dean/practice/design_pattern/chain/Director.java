package xyz.dean.practice.design_pattern.chain;

public class Director extends Leader {
    @Override
    protected int limit() { return 5000; }

    @Override
    protected void handle(int money) {
        System.out.println("主管批复报销" + money + "元");
    }
}
