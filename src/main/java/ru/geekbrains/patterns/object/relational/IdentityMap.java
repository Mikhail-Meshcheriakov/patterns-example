package ru.geekbrains.patterns.object.relational;

import java.util.HashMap;
import java.util.Map;

public class IdentityMap {
    private static volatile IdentityMap instance;
    private Map<Long, Product> productMap = new HashMap<Long, Product>();

    public static void addProduct(Product product) {
        instance.productMap.put(product.getId(), product);
    }

    public static Product getProduct(Long id) {
        return instance.productMap.get(id);
    }
}
