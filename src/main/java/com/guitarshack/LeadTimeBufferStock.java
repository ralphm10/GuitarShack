package com.guitarshack;

public class LeadTimeBufferStock implements BufferStock {
    private final RateOfSales rateOfSales;

    public LeadTimeBufferStock(RateOfSales rateOfSales) {

        this.rateOfSales = rateOfSales;
    }

    @Override
    public int calculate(Product product) {
        return (int) Math.round(product.getLeadTime() * rateOfSales.perDay(product.getId()));
    }
}
