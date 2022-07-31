package xyz.dean.practice.design_pattern.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ImageEditor {
    private CompoundGraphic all;

    public void add(Graphic c) { all.add(c); }
    public void draw() { all.draw(); }

    public void load(Consumer<CompoundGraphic> initF) {
        all = new CompoundGraphic();
        initF.accept(all);
    }

    public CompoundGraphic groupSelected(List<Graphic> components) {
        CompoundGraphic group = new CompoundGraphic();
        components.forEach(c -> {
            group.add(c);
            all.remove(c);
        });
        all.add(group);
        return group;
    }

    @Override
    public String toString() {
        return "ImageEditor{" +
                "all=" + all +
                '}';
    }

public static void main(String[] args) {
    ImageEditor editor = new ImageEditor();
    Dot dot1 = new Dot(1, 2);
    Circle circle = new Circle(5, 3, 10);
    editor.load(root -> {
        root.add(dot1);
        root.add(circle);
    });
    editor.draw();
    Dot dot2 = new Dot(2, 4);
    Dot dot3 = new Dot(3, 6);
    editor.add(dot2);
    editor.add(dot3);
    List<Graphic> selected = new ArrayList<>(3);
    selected.add(dot1);
    selected.add(dot2);
    selected.add(dot3);
    Graphic group = editor.groupSelected(selected);
    group.move(1, 0);
    editor.draw();
}
}
