package com.guitarshack;

public class SalesListener {
    private final Notification notification;

    public SalesListener(Notification notification) {
        this.notification = notification;
    }

    public void onSale(int productId, int quantity) {
        notification.send();
    }
}
