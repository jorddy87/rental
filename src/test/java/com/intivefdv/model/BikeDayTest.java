package com.intivefdv.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BikeDayTest {

    private Bike<Integer> bikeDay;

    @Before
    public void setUp() throws Exception {
        this.bikeDay = new BikeDay();
    }

    @Test
    public void rentByFiveDays() throws Exception {
        Double actualPrice = this.bikeDay.rent(5);
        Double expectedPrice = 100d;
        assertEquals(expectedPrice, actualPrice);
    }

    @Test(expected = NullPointerException.class)
    public void rentWithNullArgument() throws Exception {
        this.bikeDay.rent(null);
    }

    @Test
    public void familyRentByFiveDaysWithFiveRentals() throws Exception {
        Double actualPrice = this.bikeDay.familyRent(5, 5);
        Double expectedPrice = 350d;
        assertEquals(expectedPrice, actualPrice);
    }

    @Test(expected = NullPointerException.class)
    public void familyRentWithNullArguments() throws Exception {
        this.bikeDay.familyRent(null, null);
    }
}