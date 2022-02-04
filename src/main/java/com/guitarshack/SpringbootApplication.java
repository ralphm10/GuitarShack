package com.guitarshack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@SpringBootApplication
    @RestController
    public class SpringbootApplication {

        public static void main(String[] args) {
            SpringApplication.run(SpringbootApplication.class, args);
        }

        @GetMapping("/")
        public String hello() {
            SmsSender smsSender = new SmsSender();
            smsSender.send("Hello Guitar Shack!");
            return "Hello Guitar Shack!";
        }

        @GetMapping("/sale")
        public String sale(int productId, int quantity)  {
            Today today = () -> Calendar.getInstance().getTime();
            Notification notification = new SmsSender();
            final String warehouseServiceUrl = System.getenv("WAREHOUSE_SERVICE_URL");
            final String salesServiceUrl = System.getenv("SALES_SERVICE_URL");
            SalesListener salesListener = new SalesListener(
                    notification,
                    new ProductWarehouse(
                            new RetrofitService(warehouseServiceUrl)
                    ),
                    new LeadTimeBufferStock(
                            new LastMonthRateOfSales(
                                    new ProductSalesHistory(
                                            new SalesWebService(
                                                    new RetrofitService(salesServiceUrl)
                                            )
                                    ),
                                    new DateRangeCalculator(today)
                            )
                    )
            );
            salesListener.onSale(productId, quantity);
            return quantity + " of " + productId + " sold " ;
        }

    }

