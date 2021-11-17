package com.guitarshack;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class NotificationTextTest {

    private NotificationBuilder notificationBuilder;

    @Test
    public void correctProductIdIsReturnedInText() {
        assertThat(notificationBuilder.build(), containsString("Please re-order product id 757"));
    }

    @Test
    public void correctProductDescriptionIsReturnedInText() {
        assertThat(notificationBuilder.build(), containsString(" - Fender Player Stratocaster w/ Maple Fretboard in Buttercream\n"));
    }

    @Test
    public void correctMinimumOrderIsReturnedInText() {
        assertThat(notificationBuilder.build(), containsString("Min Order: 10\n"));
    }

    @Test
    public void correctRackSpaceIsReturnedInText() {
        assertThat(notificationBuilder.build(), containsString("Rack Space: 20"));
    }

    @Before
    public void setUp() {
        Product product = new Product(757, "Fender Player Stratocaster w/ Maple Fretboard in Buttercream", 12, 10, 20);
        notificationBuilder = new NotificationBuilder(product);
    }
}
