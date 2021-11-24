package com.guitarshack;

import java.util.Calendar;
import java.util.Date;

public class LastMonthRateOfSales implements RateOfSales {
    public static final int DATE_RANGE = 30;
    private final SalesHistory salesHistory;
    private final Today today;

    public LastMonthRateOfSales(SalesHistory salesHistory, Today today) {
        this.salesHistory = salesHistory;
        this.today = today;
    }

    @Override
    public double perDay(int productId) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today.get());
        calendar.add(Calendar.DATE, -DATE_RANGE);
        Date startDate = calendar.getTime();
        return (double) salesHistory.totalSales(productId, startDate, today.get()) / DATE_RANGE;
    }
}
