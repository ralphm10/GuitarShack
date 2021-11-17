package com.guitarshack;

public class Product {
    private final int productId;
    private final String description;
    private final int stock;
    private final int minimumOrder;
    private final int rackSpace;
    private final int leadTime;

    public Product(int productId, String description, int stock, int minimumOrder, int rackSpace, int leadTime) {
        this.productId = productId;
        this.description = description;
        this.stock = stock;
        this.minimumOrder = minimumOrder;
        this.rackSpace = rackSpace;
        this.leadTime = leadTime;
    }

    public int getId() {
        return productId;
    }

    public String getDescription() {
        return description;
    }

    public int getMinOrder() { return minimumOrder; }

    public int getRackSpace() { return rackSpace; }

    public int getStock() { return stock; }

    public int getLeadTime() {
        return leadTime;
    }
}
