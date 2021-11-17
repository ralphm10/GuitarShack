package com.guitarshack;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class BufferStockTest {

    @Test
    public void bufferStockIsCalculated() {

        RateOfSales rateOfSales = () -> 2d;
        BufferStock bufferStock = new LeadTimeBufferStock(rateOfSales);
        Product product = new Product(0, "", 0, 0, 0, 10);
        assertEquals(20, bufferStock.calculate(product));
    }
}
