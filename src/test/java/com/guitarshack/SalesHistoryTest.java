package com.guitarshack;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class SalesHistoryTest {

    @Test
    public void retrievesCorrectTotal() {
        SalesHistory salesHistory = new ProductSalesHistory();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020,Calendar.JULY, 17);
        Date startDate = calendar.getTime();
        calendar.set(2020,Calendar.JULY, 27);
        Date endDate = calendar.getTime();
        assertEquals(16, salesHistory.totalSales(811, startDate, endDate));
    }
}
