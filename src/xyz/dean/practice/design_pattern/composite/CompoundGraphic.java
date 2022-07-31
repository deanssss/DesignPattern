package xyz.dean.practice.design_pattern.composite;

import java.util.LinkedList;
import java.util.List;

public class CompoundGraphic implements Graphic {
    public List<Graphic> children = new LinkedList<>();

    public void add(Graphic child) { children.add(child); }
    public void remove(Graphic child) { children.remove(child); }
    @Override
    public void move(int x, int y) { children.forEach(c -> c.move(x, y)); }

    @Override
    public void draw() {
        System.out.println("draw compounds start.");
        children.forEach(Graphic::draw);
        System.out.println("draw compounds end.");
    }
}
