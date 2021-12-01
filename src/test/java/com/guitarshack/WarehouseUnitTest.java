package com.guitarshack;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WarehouseUnitTest extends WarehouseTestBase {
    @Override
    protected Warehouse createWarehouse() {
        Product product = new Product(811,"",0,0,0,0);
        ProductWarehouse warehouse = mock(ProductWarehouse.class);
        when(warehouse.getProduct(811)).thenReturn(product);
        return warehouse;
    }
}
