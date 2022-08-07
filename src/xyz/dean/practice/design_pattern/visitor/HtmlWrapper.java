package xyz.dean.practice.design_pattern.visitor;

public class HtmlWrapper implements Visitable {
    @Override
    public void visit(Visitor visitor) { visitor.visit(this); }
}
