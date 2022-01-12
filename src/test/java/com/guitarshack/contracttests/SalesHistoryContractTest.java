package com.guitarshack.contracttests;

import com.guitarshack.SalesHistoryTestBase;
import com.guitarshack.SalesWebService;
import com.guitarshack.Service;

public class SalesHistoryContractTest extends SalesHistoryTestBase {

    @Override
    public SalesWebService createSalesWebService() {
        return new SalesWebService(new Service("https://gjtvhjg8e9.execute-api.us-east-2.amazonaws.com"));
    }
}
