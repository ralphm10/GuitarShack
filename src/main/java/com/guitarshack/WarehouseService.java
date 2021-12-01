package com.guitarshack;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WarehouseService {

    @GET("/default/product?")
    Call<Product> getProduct(@Query("id") int productId);



}
