package xyz.dean.practice.design_pattern.visitor;

public class Compressor implements Visitor {
    @Override
    public void visit(PdfFile file) {
        System.out.println("压缩Pdf文件。");
    }

    @Override
    public void visit(PPTFile file) {
        System.out.println("压缩PPT文件。");
    }

    @Override
    public void visit(HtmlWrapper html) {
        System.out.println("压缩HTML。");
    }
}
