package xyz.dean.practice.design_pattern.prototype;

public class Word extends Document {
    @Override
    public void print() {
        System.out.println("Word. tag:" + tag);
    }

    @Override
    public Document clone() {
        Word w = new Word();
        w.tag = tag;
        return w;
    }
}
