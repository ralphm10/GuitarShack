package com.guitarshack;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class SalesWebService {
    public SalesWebService() {
    }

    public int getTotal(int productId, String startDateString, String endDateString) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://gjtvhjg8e9.execute-api.us-east-2.amazonaws.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        SalesService service = retrofit.create(SalesService.class);

        Call<SalesTotal> salesTotalCall = service.getTotalSales(productId, startDateString, endDateString, "total");

        int total = -1;
        try {

            Response<SalesTotal> execute = salesTotalCall.execute();
            SalesTotal body = execute.body();
            total = body.total;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return total;
    }
}