package com.guitarshack;

public class SalesListener {
    private final Notification notification;
    private final Warehouse warehouse;
    private final BufferStock bufferStock;

    public SalesListener(Notification notification, Warehouse warehouse, BufferStock bufferStock) {
        this.notification = notification;
        this.warehouse = warehouse;
        this.bufferStock = bufferStock;
    }

    public void onSale(int productId, int quantity) {
        Product product = warehouse.getProduct(productId);
        if(product.getStock() - quantity <= bufferStock.calculate(product)) {
            notification.send(new NotificationBuilder(product).build());
        }
    }
}
