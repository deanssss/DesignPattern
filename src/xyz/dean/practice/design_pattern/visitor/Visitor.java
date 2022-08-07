package xyz.dean.practice.design_pattern.visitor;

public interface Visitor {
    void visit(PdfFile file);
    void visit(PPTFile file);
    void visit(HtmlWrapper html);
}

