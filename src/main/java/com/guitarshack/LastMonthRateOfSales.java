package com.guitarshack;

public class LastMonthRateOfSales implements RateOfSales {
    private final SalesHistory salesHistory;

    public LastMonthRateOfSales(SalesHistory salesHistory, Today today) {
        this.salesHistory = salesHistory;
    }

    @Override
    public double perDay(int productId) {
        return salesHistory.totalSales(productId, null, null) / 30 ;
    }
}
