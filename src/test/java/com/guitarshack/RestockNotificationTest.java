package com.guitarshack;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class RestockNotificationTest {

    @Test
    public void restockNotificationIsSent() {
        Notification notification = mock(Notification.class);
        SalesListener salesListener = new SalesListener(notification);
        salesListener.onSale(757, 2);
        verify(notification).send();
    }

}
