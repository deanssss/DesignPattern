package xyz.dean.practice.design_pattern.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeTypeFactory {
    private static final Map<String, TreeType> treeTypes = new HashMap<>();
    public static TreeType getTreeType(String name, Color color, byte[] texture) {
        String key = name + color + texture.length;
        TreeType type = treeTypes.get(key);
        if (type == null) {
            type = new TreeType(name, color, texture);
            treeTypes.put(key, type);
        }
        return type;
    }
}
