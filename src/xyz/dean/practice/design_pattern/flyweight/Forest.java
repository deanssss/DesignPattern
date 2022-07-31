package xyz.dean.practice.design_pattern.flyweight;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class Forest {
    private final List<Tree> trees = new LinkedList<>();

    public void plantTree(int x, int y, String name, Color color, byte[] texture) {
        TreeType type = TreeTypeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public void draw() { trees.forEach(Tree::draw); }
}
