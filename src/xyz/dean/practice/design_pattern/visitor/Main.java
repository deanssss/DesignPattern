package xyz.dean.practice.design_pattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) {
    List<Visitable> resources = new ArrayList<>();
    resources.add(new PdfFile("a.pdf"));
    resources.add(new PPTFile("b.ppt"));
    resources.add(new HtmlWrapper());

    Extractor extractor = new Extractor();
    resources.forEach(r -> r.visit(extractor));
    Compressor compressor = new Compressor();
    resources.forEach(r -> r.visit(compressor));
}
}
