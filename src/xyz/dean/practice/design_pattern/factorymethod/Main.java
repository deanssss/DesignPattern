package xyz.dean.practice.design_pattern.factorymethod;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Product product = clientMethod(PRODUCT_A);
        product.doStuff();
    }

    public static final String PRODUCT_A = "a";
    public static final String PRODUCT_B = "b";

    private static final Map<String, Factory> factoryMap = new HashMap<>();
    static {
        factoryMap.put(PRODUCT_A, new ProductAFactory());
        factoryMap.put(PRODUCT_B, new ProductBFactory());
    }

    public static Product clientMethod(String type) {
        Factory factory = factoryMap.get(type);
        if (factory != null) {
            return factory.createProduct();
        } else {
            return null;
        }
    }
}
