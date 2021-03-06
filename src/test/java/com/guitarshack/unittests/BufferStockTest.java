package com.guitarshack.unittests;

import com.guitarshack.BufferStock;
import com.guitarshack.LeadTimeBufferStock;
import com.guitarshack.Product;
import com.guitarshack.RateOfSales;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class BufferStockTest {

    @Test
    public void bufferStockIsCalculated() {

        RateOfSales rateOfSales = (int i) -> 2d;
        BufferStock bufferStock = new LeadTimeBufferStock(rateOfSales);
        Product product = new Product(0, "", 0, 0, 0, 10);
        assertEquals(20, bufferStock.calculate(product));
    }
}
