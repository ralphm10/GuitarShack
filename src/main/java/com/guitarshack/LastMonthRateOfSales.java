package com.guitarshack;

public class LastMonthRateOfSales implements RateOfSales {
    public static final int DATE_RANGE = 30;
    private final SalesHistory salesHistory;
    private final DateRangeCalculator dateRangeCalculator;

    public LastMonthRateOfSales(SalesHistory salesHistory, DateRangeCalculator dateRangeCalculator) {
        this.salesHistory = salesHistory;
        this.dateRangeCalculator = dateRangeCalculator;
    }

    @Override
    public double perDay(int productId) {
        DateRange dateRange = dateRangeCalculator.getDateRange();
        return (double) salesHistory.totalSales(productId, dateRange.getStartDate(), dateRange.getEndDate()) / dateRange.getLength();
    }

}
