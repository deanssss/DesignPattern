package xyz.dean.practice.design_pattern.builder;

public class ConcreteBuilder2 implements Builder {
    private Product2 product = null;

    @Override
    public void reset() {
        product = new Product2();
    }

    @Override
    public void buildStepA() {
    }

    @Override
    public void buildStepB() {
        product.setFeatureB();
    }

    @Override
    public void buildStepZ() {
        product.setFeatureZ();
    }

    public Product2 getResult() {
        return product;
    }
}
