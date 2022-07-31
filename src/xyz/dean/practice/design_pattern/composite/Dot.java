package xyz.dean.practice.design_pattern.composite;

public class Dot implements Graphic {
    public int x;
    public int y;
    public Dot(int x, int y) {
        this.x = x; this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x += x; this.y += y;
    }

    @Override
    public void draw() {
        System.out.println("draw point at x:" + x + ", y:" + y);
    }
}
