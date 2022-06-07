package xyz.dean.practice.design_pattern.factorymethod;

public class ProductAFactory extends Factory {
    @Override
    Product createProduct() {
        return new ProductA();
    }
}
