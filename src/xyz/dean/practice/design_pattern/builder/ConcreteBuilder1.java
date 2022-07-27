package xyz.dean.practice.design_pattern.builder;

public class ConcreteBuilder1 implements Builder {
    private Product1 product = null;

    @Override
    public void reset() {
        product = new Product1();
    }

    @Override
    public void buildStepA() {
        product.setFeatureA();
    }

    @Override
    public void buildStepB() {
    }

    @Override
    public void buildStepZ() {
    }

    public Product1 getResult() {
        return product;
    }
}
