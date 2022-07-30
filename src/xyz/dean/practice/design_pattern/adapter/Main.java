package xyz.dean.practice.design_pattern.adapter;

public class Main {
public static void main(String[] args) {
    RoundHole hole = new RoundHole(5);
    RoundPeg roundPeg = new RoundPeg(5);
    hole.fits(roundPeg);

    SquarePeg squarePeg1 = new SquarePeg(5);
    SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg1);
    System.out.println("square peg 1 fits hole: " + hole.fits(squarePegAdapter));
    IRoundPeg squarePeg2 = new AdaptSquarePeg(10);
    System.out.println("square peg 2 fits hole: " + hole.fits(squarePeg2));
}
}
