package xyz.dean.practice.design_pattern.visitor;

public class PPTFile extends ResourceFile implements Visitable {
    public PPTFile(String path) { super(path); }
    @Override
    public void visit(Visitor visitor) { visitor.visit(this); }
}
