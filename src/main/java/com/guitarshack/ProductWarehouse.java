package com.guitarshack;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class ProductWarehouse implements Warehouse {
    @Override
    public Product getProduct(int productId) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://6hr1390c1j.execute-api.us-east-2.amazonaws.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        WarehouseService service = retrofit.create(WarehouseService.class);

        Call<Product> productCall = service.getProduct(productId);

        Product product = null;
        try {
            Response<Product> execute = productCall.execute();
            product = execute.body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return product;
    }
}
