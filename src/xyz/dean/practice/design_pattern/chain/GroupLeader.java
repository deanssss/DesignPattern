package xyz.dean.practice.design_pattern.chain;

public class GroupLeader extends Leader {
    @Override
    protected int limit() { return 1000; }

    @Override
    protected void handle(int money) {
        System.out.println("组长批复报销" + money + "元");
    }
}
