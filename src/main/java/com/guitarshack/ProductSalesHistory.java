package com.guitarshack;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.Date;

public class ProductSalesHistory implements SalesHistory {
    @Override
    public int totalSales(int productId, Date startDate, Date endDate) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://gjtvhjg8e9.execute-api.us-east-2.amazonaws.com/default/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        SalesService service = retrofit.create(SalesService.class);

        Call<SalesTotal> salesTotalCall = service.getTotalSales(811,"7%2F17%2F2020", "7%2F27%2F2020", "total");

        try {

            Response<SalesTotal> execute = salesTotalCall.execute();
            System.out.println(execute.code());
            SalesTotal body = execute.body();
            System.out.println(body);
            return body.total ;
        } catch (IOException e) {
            e.printStackTrace();
            return 4;
        }
    }
}
