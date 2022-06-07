package xyz.dean.practice.design_pattern.prototype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Office {
    private Map<String, Document> documents = new HashMap<>();

    public void addDocument(String id, Document document) {
        documents.put(id, document);
    }

    public Document getDocument(String id) {
        Document document = documents.get(id);
        return document.clone();
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class clazz = Class.forName(args[0]);
        Document document = (Document) clazz.newInstance();
        document.tag = "prototype";
        document.print();

        Document copy = document.clone();
        copy.tag = "copy";
        copy.print();

        long start = System.nanoTime();
        Document reflect = (Document) clazz.newInstance();
        System.out.println("Time spend:" + (System.nanoTime() - start));

        start = System.nanoTime();
        Document copy1 = document.clone();
        System.out.println("Time spend:" + (System.nanoTime() - start));
    }
}

abstract class Document implements Cloneable {
    public String tag = "";
    abstract public void print();
    abstract public Document clone();
}
