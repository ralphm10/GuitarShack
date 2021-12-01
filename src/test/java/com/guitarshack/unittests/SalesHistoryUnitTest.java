package com.guitarshack.unittests;

import com.guitarshack.SalesHistoryTestBase;
import com.guitarshack.SalesWebService;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SalesHistoryUnitTest extends SalesHistoryTestBase {
    @Override
    public SalesWebService createSalesWebService() {
        SalesWebService mockSalesWebService = mock(SalesWebService.class);
        when(mockSalesWebService.getTotal(anyInt(), any(), any())).thenReturn(16);
        return mockSalesWebService;
    }
}
