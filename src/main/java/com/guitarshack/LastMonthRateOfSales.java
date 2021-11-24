package com.guitarshack;

import java.util.Calendar;
import java.util.Date;

public class LastMonthRateOfSales implements RateOfSales {
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
        calendar.add(Calendar.DATE,-30);
        Date startDate = calendar.getTime();
        return salesHistory.totalSales(productId, startDate, today.get()) / 30 ;
    }
}
