package com.guitarshack;

import retrofit2.Call;

public class SalesWebService {

    private final Service service;

    public SalesWebService(Service service) {
        this.service = service;
    }

    public SalesTotal getTotal(int productId, String startDateString, String endDateString) {
        SalesService salesService = service.getService(SalesService.class);
        Call<SalesTotal> salesTotalCall = salesService.getTotalSales(productId, startDateString, endDateString, "total");
        return service.executeCall(salesTotalCall);
    }

}