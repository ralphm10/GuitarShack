package com.guitarshack.robustnesstests;

import com.guitarshack.SalesWebService;
import org.junit.Test;

import static org.junit.Assert.assertNull;

public class SalesHistoryRobustnessTest {

    @Test
    public void returnsNullIfCallToWebServiceFails() {
        SalesWebService salesWebservice = new SalesWebService("https://stackoverflow.com/");
        assertNull(salesWebservice.getTotal(811, "12/1/2020", "12/30/2020"));
    }
}
