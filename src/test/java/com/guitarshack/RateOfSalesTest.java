package com.guitarshack;

import org.junit.Test;
import java.util.Calendar;
import static org.junit.Assert.assertEquals;

public class RateOfSalesTest {

    @Test
    public void calculateRateOfSales() {
        SalesHistory salesHistory = (productId, startDate, endDate) -> 30;
        Today today = () -> {
            Calendar calendar = Calendar.getInstance();
            calendar.set(2021,Calendar.NOVEMBER,10);
            return calendar.getTime();
        };
        RateOfSales rateOfSales = new LastMonthRateOfSales(salesHistory, today);
        assertEquals(1, rateOfSales.perDay(757), 0);
    }
}
