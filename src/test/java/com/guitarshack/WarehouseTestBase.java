package com.guitarshack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public abstract class WarehouseTestBase {
    @Test
    public void retrievesCorrectProductInfo() {
        Warehouse warehouse = createWarehouse();
        assertEquals(811, warehouse.getProduct(811).getId());
    }

    protected abstract Warehouse createWarehouse();
}
