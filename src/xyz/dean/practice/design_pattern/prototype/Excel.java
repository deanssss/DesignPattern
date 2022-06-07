package xyz.dean.practice.design_pattern.prototype;

public class Excel extends Document {
    @Override
    public void print() {
        System.out.println("Excel. tag:" + tag);
    }

    @Override
    public Document clone() {
        Excel e = new Excel();
        e.tag = tag;
        return e;
    }
}
