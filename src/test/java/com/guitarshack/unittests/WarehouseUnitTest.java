package com.guitarshack.unittests;

import com.guitarshack.Product;
import com.guitarshack.ProductWarehouse;
import com.guitarshack.Warehouse;
import com.guitarshack.WarehouseTestBase;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WarehouseUnitTest extends WarehouseTestBase {
    @Override
    public Warehouse createWarehouse() {
        Product product = new Product(811,"",0,0,0,0);
        ProductWarehouse warehouse = mock(ProductWarehouse.class);
        when(warehouse.getProduct(811)).thenReturn(product);
        return warehouse;
    }
}
