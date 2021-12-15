package com.guitarshack;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class ProductWarehouse implements Warehouse {

    private final String baseUrl;

    public ProductWarehouse(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Override
    public Product getProduct(int productId) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        WarehouseService service = retrofit.create(WarehouseService.class);

        Call<Product> productCall = service.getProduct(productId);

        Product product = null;
        try {
            Response<Product> execute = productCall.execute();
            product = execute.body();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product;
    }
}
