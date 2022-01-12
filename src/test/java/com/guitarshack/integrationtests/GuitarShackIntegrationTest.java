package com.guitarshack.integrationtests;

import com.guitarshack.DateRangeCalculator;
import com.guitarshack.LastMonthRateOfSales;
import com.guitarshack.LeadTimeBufferStock;
import com.guitarshack.Notification;
import com.guitarshack.ProductSalesHistory;
import com.guitarshack.ProductWarehouse;
import com.guitarshack.RetrofitService;
import com.guitarshack.SalesListener;
import com.guitarshack.SalesWebService;
import com.guitarshack.Today;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GuitarShackIntegrationTest {

    @Test
    public void notificationIsSent () {
        Notification notification = mock(Notification.class);
        Today today = () -> {
            Calendar calendar = Calendar.getInstance();
            calendar.set(2021, Calendar.NOVEMBER, 10);
            return calendar.getTime();
        };
        SalesListener salesListener = new SalesListener(
                notification,
                new ProductWarehouse(
                        new RetrofitService("https://6hr1390c1j.execute-api.us-east-2.amazonaws.com")
                ),
                new LeadTimeBufferStock(
                        new LastMonthRateOfSales(
                                new ProductSalesHistory(
                                        new SalesWebService(
                                                new RetrofitService("https://gjtvhjg8e9.execute-api.us-east-2.amazonaws.com")
                                        )
                                ),
                                new DateRangeCalculator(today)
                        )
                )
        );
        salesListener.onSale(811,22);
        verify(notification).send(any());
    }

}
