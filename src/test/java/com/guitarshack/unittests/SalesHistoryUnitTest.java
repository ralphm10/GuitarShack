package com.guitarshack.unittests;

import com.guitarshack.SalesHistoryTestBase;
import com.guitarshack.SalesTotal;
import com.guitarshack.SalesWebService;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SalesHistoryUnitTest extends SalesHistoryTestBase {
    @Override
    public SalesWebService createSalesWebService() {
        SalesWebService mockSalesWebService = mock(SalesWebService.class);
        SalesTotal salesTotal = new SalesTotal();
        salesTotal.total = 16;
        when(mockSalesWebService.getTotal(anyInt(), any(), any())).thenReturn(salesTotal);
        return mockSalesWebService;
    }
}
