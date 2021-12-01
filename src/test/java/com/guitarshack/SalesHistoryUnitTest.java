package com.guitarshack;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SalesHistoryUnitTest extends SalesHistoryTestBase{
    @Override
    protected SalesWebService createSalesWebService() {
        SalesWebService mockSalesWebService = mock(SalesWebService.class);
        when(mockSalesWebService.getTotal()).thenReturn(16);
        return mockSalesWebService;
    }
}
