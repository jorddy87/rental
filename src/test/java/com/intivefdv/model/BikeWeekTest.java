package com.intivefdv.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BikeWeekTest {

    private Bike<Integer> bikeWeek;

    @Before
    public void setUp() throws Exception {
        this.bikeWeek = new BikeWeek();
    }

    @Test
    public void rentByFiveWeeks() throws Exception {
        Double actualPrice = this.bikeWeek.rent(5);
        Double expectedPrice = 300d;
        assertEquals(expectedPrice, actualPrice);
    }

    @Test(expected = NullPointerException.class)
    public void rentWithNullArgument() throws Exception {
        this.bikeWeek.rent(null);
    }

    @Test
    public void familyRentByFiveWeeksWithFiveRentals() throws Exception {
        Double actualPrice = this.bikeWeek.familyRent(5, 5);
        Double expectedPrice = 1050d;
        assertEquals(expectedPrice, actualPrice);
    }

    @Test(expected = NullPointerException.class)
    public void familyRentWithNullArguments() throws Exception {
        this.bikeWeek.familyRent(null, null);
    }
}