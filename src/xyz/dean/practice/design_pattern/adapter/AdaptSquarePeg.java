package xyz.dean.practice.design_pattern.adapter;

public class AdaptSquarePeg extends SquarePeg implements IRoundPeg {
    public AdaptSquarePeg(float width) {
        super(width);
    }

    @Override
    public float getRadius() {
        return (float) (getWidth() * Math.sqrt(2) / 2);
    }
}
