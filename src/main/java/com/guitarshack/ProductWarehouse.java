package com.guitarshack;

import retrofit2.Call;

public class ProductWarehouse extends Service implements Warehouse {

    public ProductWarehouse(String baseUrl) {
        super(baseUrl);
    }

    @Override
    public Product getProduct(int productId) {
        WarehouseService service = getService(WarehouseService.class);

        Call<Product> productCall = service.getProduct(productId);

        return executeCall(productCall);
    }

}
