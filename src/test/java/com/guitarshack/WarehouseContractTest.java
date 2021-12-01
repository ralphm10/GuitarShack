package com.guitarshack;

public class WarehouseContractTest extends WarehouseTestBase {

    @Override
    protected Warehouse createWarehouse() {
        return new ProductWarehouse();
    }

}
