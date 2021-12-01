package com.guitarshack.contracttests;

import com.guitarshack.SalesHistoryTestBase;
import com.guitarshack.SalesWebService;

public class SalesHistoryContractTest extends SalesHistoryTestBase {

    @Override
    public SalesWebService createSalesWebService() {
        return new SalesWebService();
    }
}
