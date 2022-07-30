package xyz.dean.practice.design_pattern.adapter;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;
    public SquarePegAdapter(SquarePeg squarePeg) {
        super(0);
        this.squarePeg = squarePeg;
    }

    public void setSquarePeg(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public float getRadius() {
        return (float) (squarePeg.getWidth() * Math.sqrt(2) / 2);
    }
}
