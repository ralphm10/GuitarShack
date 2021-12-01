package com.guitarshack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarehouseTest {
    @Test
    public void retrievesCorrectProductInfo() {
        Warehouse warehouse = new ProductWarehouse();
        assertEquals(811, warehouse.getProduct(811).getId());
    }

}
