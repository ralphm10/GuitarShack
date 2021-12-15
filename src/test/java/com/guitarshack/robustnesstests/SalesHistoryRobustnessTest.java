package com.guitarshack.robustnesstests;

import com.guitarshack.SalesWebService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SalesHistoryRobustnessTest {

    @Test
    public void returnsSalesOfMinusOneIfCallToWebServiceFails() {
        SalesWebService salesWebservice = new SalesWebService("https://stackoverflow.com/");
        assertEquals(-1, salesWebservice.getTotal(811, "12/1/2020", "12/30/2020"));
    }
}
