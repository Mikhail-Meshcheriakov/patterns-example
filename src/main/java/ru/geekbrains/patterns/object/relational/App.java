package ru.geekbrains.patterns.object.relational;

public class App {
    public static void main(String[] args) {
        ProductMapper productMapper = new ProductMapper(connection);
        Product product = IdentityMap.getProduct(id);
        if (product == null) {
            product = productMapper.findById(id);
            IdentityMap.addProduct(product);
        }
    }
}
