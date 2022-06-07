package xyz.dean.practice.design_pattern.factorymethod;

public class Main {
    public static void main(String[] args) {
        Factory factory = new ProductAFactory();
        clientMethod(factory);
    }

    public static void clientMethod(Factory factory) {
        Product product = factory.createProduct();
        product.doStuff();
    }
}
