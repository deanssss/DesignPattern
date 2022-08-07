package xyz.dean.practice.design_pattern.visitor;

public class PdfFile extends ResourceFile implements Visitable {
    public PdfFile(String path) { super(path); }
    @Override
    public void visit(Visitor visitor) { visitor.visit(this); }
}
