package xyz.dean.practice.design_pattern.factorymethod;

public class ProductBFactory extends Factory {
    @Override
    Product createProduct() {
        return new ProductB();
    }
}
