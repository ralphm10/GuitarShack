package com.guitarshack;

import org.junit.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class RestockNotificationTest {

    @Test
    public void restockNotificationIsSentForProduct757() {
        Notification notification = mock(Notification.class);
        Product product = new Product(757, "Fender Player Stratocaster w/ Maple Fretboard in Buttercream", 12, 10, 20, 10);
        Warehouse warehouse = productId -> product;
        BufferStock bufferStock = product1 -> 10;
        SalesListener salesListener = new SalesListener(notification, warehouse, bufferStock);
        salesListener.onSale(757, 2);
        verify(notification).send(new NotificationBuilder(product).build());
    }

    @Test
    public void restockNotificationNotSentOnSale() {
        Notification notification = mock(Notification.class);
        Product product = new Product(757,"", 15,0,0, 10);
        Warehouse warehouse = productId -> product;
        BufferStock bufferStock = product1 -> 10;
        SalesListener salesListener = new SalesListener(notification,warehouse, bufferStock);
        salesListener.onSale(757, 2);
        verify(notification, never()).send(any());
    }
}
