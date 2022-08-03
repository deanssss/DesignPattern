package xyz.dean.practice.design_pattern.strategy;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private final Map<Character, Strategy> strategies = new HashMap<>();

    public void addStrategy(char op, Strategy strategy) {
        this.strategies.putIfAbsent(op, strategy);
    }

    public void doSomething(int a, int b, char op) {
        Strategy strategy = strategies.get(op);
        if (strategy != null) {
            System.out.println("Apply strategy with a=" + a + ", b=" + b + ","
                    + "and the result is " + strategy.execute(a, b));
        } else {
            System.out.println("No strategy for option '" + op + "'");
        }
    }
}
