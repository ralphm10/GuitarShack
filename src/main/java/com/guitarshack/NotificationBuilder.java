package com.guitarshack;

public class NotificationBuilder {
    private final Product product;

    public NotificationBuilder(Product product) {
        this.product = product;
    }

    public String build() {
        return "Please re-order product id " + product.getId() +
                " - " + product.getDescription() +
                "\nMin Order: " + product.getMinOrder() +
                "\nRack Space: " + product.getRackspace()
        ;
    }
}
