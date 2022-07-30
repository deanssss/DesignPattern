package xyz.dean.practice.design_pattern.adapter;

public class RoundHole {
    private final float radius;
    public RoundHole(float radius) { this.radius = radius; }

    public boolean fits(IRoundPeg peg) {
        return radius >= peg.getRadius();
    }
}
