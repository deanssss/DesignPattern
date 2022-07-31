package xyz.dean.practice.design_pattern.composite;

public class Circle extends Dot {
    public int radius;
    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("draw circle at x:" + x + ", y:" + y + ", radius: " + radius);
    }
}
