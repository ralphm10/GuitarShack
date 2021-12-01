package com.guitarshack.contracttests;

import com.guitarshack.ProductWarehouse;
import com.guitarshack.Warehouse;
import com.guitarshack.WarehouseTestBase;

public class WarehouseContractTest extends WarehouseTestBase {

    @Override
    public Warehouse createWarehouse() {
        return new ProductWarehouse();
    }

}
