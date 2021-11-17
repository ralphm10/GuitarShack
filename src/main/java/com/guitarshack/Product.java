package com.guitarshack;

public class Product {
    private final int productId;
    private final String description;
    private final int minimumOrder;
    private final int rackSpace;

    public Product(int productId, String description, int stock, int minimumOrder, int rackSpace) {
        this.productId = productId;
        this.description = description;
        this.minimumOrder = minimumOrder;
        this.rackSpace = rackSpace;
    }

    public int getId() {
        return productId;
    }

    public String getDescription() {
        return description;
    }

    public int getMinOrder() { return minimumOrder; }

    public int getRackSpace() { return rackSpace; }
}
