package xyz.dean.practice.design_pattern.chain;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Leader leaderChain = Leader.buildChain(
            new GroupLeader(),
            new Director(),
            new Manager(),
            new Boss()
    );
    boolean handled;
    do {
        System.out.print("你要申请多少：");
        int money = scanner.nextInt();
        handled = leaderChain.handleRequest(money);
    } while (handled);
}
}
