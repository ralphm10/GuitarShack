package com.guitarshack;

import java.util.Date;

public interface SalesHistory {
    int totalSales(int productId, Date startDate, Date endDate);
}
