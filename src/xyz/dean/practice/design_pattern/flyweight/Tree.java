package xyz.dean.practice.design_pattern.flyweight;

public class Tree {
    public int x;
    public int y;
    public TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw() { type.draw(x, y); }
}
