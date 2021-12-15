package com.guitarshack;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public abstract class Service {
    protected final String baseUrl;

    public Service(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    protected <R> R executeCall(Call<R> call) {
        R result = null;
        try {
            Response<R> execute = call.execute();
            result = execute.body();
        } catch (Exception ignored) {
        }
        return result;
    }

    protected <T> T getService(Class<T> serviceType) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(serviceType);
    }
}
