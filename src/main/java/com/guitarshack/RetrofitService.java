package com.guitarshack;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService implements Service {
    protected final String baseUrl;

    public RetrofitService(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Override
    public  <R> R executeCall(Call<R> call) {
        R result = null;
        try {
            Response<R> execute = call.execute();
            result = execute.body();
        } catch (Exception ignored) {
        }
        return result;
    }

    @Override
    public <T> T getService(Class<T> serviceType) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(serviceType);
    }
}
