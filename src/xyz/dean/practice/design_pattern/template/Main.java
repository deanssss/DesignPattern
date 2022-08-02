package xyz.dean.practice.design_pattern.template;

public class Main {
public static void main(String[] args) {
    AbstractComputer computer = new PersonalComputer();
    computer.start();

    computer = new HighSecurityComputer();
    computer.start();
}
}
