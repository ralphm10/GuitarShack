package com.guitarshack;

public class SalesHistoryContractTest extends SalesHistoryTestBase {

    @Override
    protected SalesWebService createSalesWebService() {
        return new SalesWebService();
    }
}
