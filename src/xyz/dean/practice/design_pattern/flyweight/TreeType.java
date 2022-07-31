package xyz.dean.practice.design_pattern.flyweight;

import java.awt.*;

public class TreeType {
    public final String name;
    public final Color color;
    public final byte[] texture;

    public TreeType(String name, Color color, byte[] texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(int x, int y) {
        System.out.println("draw a tree" + this
                + ", position:(" + x + "," + y + ")");
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", color=" + color +
                '}';
    }
}
