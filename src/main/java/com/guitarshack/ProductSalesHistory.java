package com.guitarshack;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProductSalesHistory implements SalesHistory {
    private final SalesWebService salesWebService;

    public ProductSalesHistory(SalesWebService salesWebService) {
        this.salesWebService = salesWebService;
    }

    @Override
    public int totalSales(int productId, Date startDate, Date endDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("M/d/yyyy");
        String startDateString = dateFormat.format(startDate);
        String endDateString = dateFormat.format(endDate);
        return salesWebService.getTotal(productId, startDateString, endDateString).total;
    }

}
