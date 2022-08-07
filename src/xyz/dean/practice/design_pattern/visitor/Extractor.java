package xyz.dean.practice.design_pattern.visitor;

public class Extractor implements Visitor {
    @Override
    public void visit(PdfFile file) {
        System.out.println("导出Pdf中的内容。");
    }

    @Override
    public void visit(PPTFile file) {
        System.out.println("导出PPT中的内容。");
    }

    @Override
    public void visit(HtmlWrapper html) {
        System.out.println("导出网页中的内容。");
    }
}
