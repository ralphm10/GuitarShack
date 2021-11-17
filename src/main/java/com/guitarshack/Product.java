package com.guitarshack;

public class Product {
    private final int productId;
    private final String description;

    public Product(int productId, String description, int stock, int minimumOrder, int rackSpace) {
        this.productId = productId;
        this.description = description;
    }

    public int getId() {
        return productId;
    }

    public String getDescription() {
        return description;
    }
}
