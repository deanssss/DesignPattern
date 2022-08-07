package xyz.dean.practice.design_pattern.interperter;

public class Main {
public static void main(String[] args) {
    Calculator calculator = new Calculator();
    System.out.println(calculator.interpret("1 2 3 1 + - +"));
}
}
