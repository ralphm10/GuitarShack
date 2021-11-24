package com.guitarshack;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SalesService {

    @GET("sales?")
    Call<SalesTotal> getTotalSales(@Query("productId") int productId,
                                   @Query("startDate") String startDate,
                                   @Query("endDate") String endDate,
                                   @Query("action") String action);
}
