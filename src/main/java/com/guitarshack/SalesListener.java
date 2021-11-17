package com.guitarshack;

public class SalesListener {
    private final Notification notification;
    private final Warehouse warehouse;

    public SalesListener(Notification notification, Warehouse warehouse, BufferStock bufferStock) {
        this.notification = notification;
        this.warehouse = warehouse;
    }

    public void onSale(int productId, int quantity) {
        Product product = warehouse.getProduct(productId);
        notification.send(new NotificationBuilder(product).build());
    }
}
