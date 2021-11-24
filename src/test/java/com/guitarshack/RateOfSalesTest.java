package com.guitarshack;

import org.junit.Before;
import org.junit.Test;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class RateOfSalesTest {

    private RateOfSales rateOfSales;
    private Calendar calendar;
    private SalesHistory salesHistory;

    @Test
    public void calculateRateOfSales() {
        assertEquals(1, rateOfSales.perDay(757), 0);
    }

    @Before
    public void setUp() {
        salesHistory = mock(SalesHistory.class);
        when(salesHistory.totalSales(anyInt(), any(), any())).thenReturn(30);
        calendar = Calendar.getInstance();
        calendar.set(2021,Calendar.NOVEMBER,10);
        Date todaysDate = calendar.getTime();
        Today today = () -> todaysDate;
        rateOfSales = new LastMonthRateOfSales(salesHistory, today);
    }

    @Test
    public void calculateStartDate() {
        calendar.set(2021, Calendar.OCTOBER, 11);
        Date startDate = calendar.getTime();
        rateOfSales.perDay(757);
        verify(salesHistory).totalSales(anyInt(), eq(startDate), any());
    }
}
