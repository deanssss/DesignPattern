package xyz.dean.practice.design_pattern.builder;

import xyz.dean.practice.design_pattern.state.ConcreteStateA;

class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void changeBuilder(Builder builder) {
        this.builder = builder;
    }

    public void make() {
        builder.reset();
        if (builder instanceof ConcreteStateA) {
            builder.buildStepA();
        } else {
            builder.buildStepB();
            builder.buildStepZ();
        }
    }

    public static void main(String[] args) {
        ConcreteBuilder1 b1 = new ConcreteBuilder1();
        ConcreteBuilder2 b2 = new ConcreteBuilder2();
        Director d = new Director(b1);
        d.make();
        Product1 p1 = b1.getResult();
        d.changeBuilder(b2);
        d.make();
        Product2 p2 = b2.getResult();
    }
}
