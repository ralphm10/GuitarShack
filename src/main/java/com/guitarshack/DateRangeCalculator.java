package com.guitarshack;

import java.util.Calendar;
import java.util.Date;

public class DateRangeCalculator {
    private final Today today;

    public DateRangeCalculator(Today today) {
        this.today = today;
    }

    DateRange getDateRange() {
        Calendar calendar = Calendar.getInstance();
        Date endDate = today.get();
        calendar.setTime(endDate);
        calendar.add(Calendar.DATE, -LastMonthRateOfSales.DATE_RANGE);
        Date startDate = calendar.getTime();
        return new DateRange(startDate, endDate);
    }
}
