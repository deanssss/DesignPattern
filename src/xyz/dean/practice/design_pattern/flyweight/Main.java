package xyz.dean.practice.design_pattern.flyweight;

import java.awt.*;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.util.Random;

public class Main {
public static void main(String[] args) {
    Random random = new Random(System.currentTimeMillis());
    Forest forest = new Forest();
    String[] names = new String[] {"松树", "桦树", "鸡爪槭"};
    Color[] colors = new Color[] {
            new Color(0, 51, 0),
            new Color(187, 102, 0),
            new Color(187, 0, 119)
    };
    int[] textures = new int[] {30960, 10240, 20480};
    for (int i = 0; i < 10000; i++) {
        // 种1w颗树
        int x = random.nextInt(100);
        int y = random.nextInt(100);
        int r = random.nextInt(100);
        forest.plantTree(x, y, names[r % 3], colors[r % 3], new byte[textures[r % 3]]);
    }
    forest.draw();
    MemoryMXBean bean = ManagementFactory.getMemoryMXBean();
    MemoryUsage usage = bean.getHeapMemoryUsage();
    System.out.println("mem used: " + usage.getUsed() / 1024 + "kb.");
}
}
