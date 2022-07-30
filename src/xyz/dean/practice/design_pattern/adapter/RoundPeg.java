package xyz.dean.practice.design_pattern.adapter;

public class RoundPeg implements IRoundPeg {
    private final float radius;
    public RoundPeg(float radius) { this.radius = radius; }
    @Override public float getRadius() { return radius; }
}

interface IRoundPeg {
    float getRadius();
}