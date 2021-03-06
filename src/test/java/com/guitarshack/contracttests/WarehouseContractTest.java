package com.guitarshack.contracttests;

import com.guitarshack.ProductWarehouse;
import com.guitarshack.RetrofitService;
import com.guitarshack.Warehouse;
import com.guitarshack.WarehouseTestBase;

public class WarehouseContractTest extends WarehouseTestBase {

    @Override
    public Warehouse createWarehouse() {
        return new ProductWarehouse(new RetrofitService("https://6hr1390c1j.execute-api.us-east-2.amazonaws.com"));
    }

}
