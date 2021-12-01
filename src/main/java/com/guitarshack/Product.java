package com.guitarshack;

public class Product {
    private final int id;
    private final String description;
    private final int stock;
    private final int minOrder;
    private final int rackspace;
    private final int leadTime;

    public Product(int id, String description, int stock, int minOrder, int rackspace, int leadTime) {
        this.id = id;
        this.description = description;
        this.stock = stock;
        this.minOrder = minOrder;
        this.rackspace = rackspace;
        this.leadTime = leadTime;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getMinOrder() { return minOrder; }

    public int getRackspace() { return rackspace; }

    public int getStock() { return stock; }

    public int getLeadTime() {
        return leadTime;
    }
}
