package xyz.dean.practice.design_pattern.interperter;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Calculator {
    private final Deque<ArithmeticExpression> nums = new LinkedList<>();
    private final List<String> ops = new LinkedList<>();

    public int interpret(String expression) {
        String[] elements = expression.split(" ");
        for (String element : elements) {
            if (StringUtil.isNumeric(element)) {
                nums.add(new NumExpression(Integer.parseInt(element)));
            } else if (StringUtil.isValidOperator(element)) {
                ops.add(element);
            } else {
                throw new IllegalStateException("nonsupport expressions: " + expression);
            }
        }
        ArithmeticExpression exp1, exp2, combinedExp;
        for (String op : ops) {
            exp1 = nums.pollFirst();
            exp2 = nums.pollFirst();
            if (op.equals("+")) {
                combinedExp = new AdditionExpression(exp1, exp2);
            } else if (op.equals("-")) {
                combinedExp = new SubtractionExpression(exp1, exp2);
            } else {
                throw new IllegalStateException("nonsupport operator: " + op);
            }
            nums.addFirst(new NumExpression(combinedExp.interpret()));
        }
        if (nums.size() != 1) {
            throw new RuntimeException("Expression is invalid. " + expression);
        }
        return nums.pop().interpret();
    }
}
