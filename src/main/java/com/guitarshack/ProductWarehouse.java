package com.guitarshack;

import retrofit2.Call;

public class ProductWarehouse implements Warehouse {

    private final Service service;

    public ProductWarehouse(Service service) {
        this.service = service;
    }

    @Override
    public Product getProduct(int productId) {
        WarehouseService warehouseService = service.getService(WarehouseService.class);
        Call<Product> productCall = warehouseService.getProduct(productId);
        return service.executeCall(productCall);
    }

}
