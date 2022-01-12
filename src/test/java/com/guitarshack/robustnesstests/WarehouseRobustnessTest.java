package com.guitarshack.robustnesstests;

import com.guitarshack.ProductWarehouse;
import com.guitarshack.RetrofitService;
import org.junit.Test;

import static org.junit.Assert.assertNull;

public class WarehouseRobustnessTest {

    @Test
    public void returnsNullForFailedCallToProductWarehouse() {
        ProductWarehouse productWarehouse = new ProductWarehouse(new RetrofitService("https://www.randomralphswebsote.com"));
        assertNull(productWarehouse.getProduct(811));
    }
}
