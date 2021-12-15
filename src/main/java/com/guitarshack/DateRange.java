package com.guitarshack;

import java.util.Date;

public class DateRange {
    private final Date endDate;
    private final Date startDate;

    public DateRange(Date startDate, Date endDate) {
        this.endDate = endDate;
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public int getLength() {
        return (int) Math.abs((endDate.getTime() - startDate.getTime()) / 86400000);
    }
}
