package com.guitarshack;

import retrofit2.Call;

public interface Service {
    <R> R executeCall(Call<R> call);

    <T> T getService(Class<T> serviceType);
}
