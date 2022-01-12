package com.guitarshack.contracttests;

import com.guitarshack.SalesHistoryTestBase;
import com.guitarshack.SalesWebService;
import com.guitarshack.RetrofitService;

public class SalesHistoryContractTest extends SalesHistoryTestBase {

    @Override
    public SalesWebService createSalesWebService() {
        return new SalesWebService(new RetrofitService("https://gjtvhjg8e9.execute-api.us-east-2.amazonaws.com"));
    }
}
