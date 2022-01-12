package com.guitarshack.robustnesstests;

import com.guitarshack.ProductWarehouse;
import com.guitarshack.Service;
import org.junit.Test;

import static org.junit.Assert.assertNull;

public class WarehouseRobustnessTest {

    @Test
    public void returnsNullForFailedCallToProductWarehouse() {
        ProductWarehouse productWarehouse = new ProductWarehouse(new Service("https://www.randomralphswebsote.com"));
        assertNull(productWarehouse.getProduct(811));
    }
}
