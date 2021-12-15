package com.guitarshack;

import retrofit2.Call;

public class SalesWebService extends Service {

    public SalesWebService(String baseUrl) {
        super(baseUrl);
    }

    public SalesTotal getTotal(int productId, String startDateString, String endDateString) {
        SalesService service = getService(SalesService.class);

        Call<SalesTotal> salesTotalCall = service.getTotalSales(productId, startDateString, endDateString, "total");

        return executeCall(salesTotalCall);
    }

}