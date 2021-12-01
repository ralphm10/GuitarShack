package com.guitarshack;

import java.util.Date;

public class ProductSalesHistory implements SalesHistory {
    private final SalesWebService salesWebService;

    public ProductSalesHistory(SalesWebService salesWebService) {
        this.salesWebService = salesWebService;
    }

    @Override
    public int totalSales(int productId, Date startDate, Date endDate) {
        return salesWebService.getTotal();
    }

}
