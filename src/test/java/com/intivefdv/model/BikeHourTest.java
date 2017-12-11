package com.intivefdv.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BikeHourTest {

    private Bike<Integer> bikeHour;

    @Before
    public void setUp() throws Exception {
        this.bikeHour = new BikeHour();
    }

    @Test
    public void rentByFiveHours() throws Exception {
        Double actualPrice = this.bikeHour.rent(5);
        Double expectedPrice = 25d;
        assertEquals(expectedPrice, actualPrice);
    }

    @Test(expected = NullPointerException.class)
    public void rentWithNullArgument() throws Exception {
        this.bikeHour.rent(null);
    }

    @Test
    public void familyRentByFiveHoursWithFiveRentals() throws Exception {
        Double actualPrice = this.bikeHour.familyRent(5, 5);
        Double expectedPrice = 87.5d;
        assertEquals(expectedPrice, actualPrice);
    }

    @Test(expected = NullPointerException.class)
    public void familyRentWithNullArguments() throws Exception {
        this.bikeHour.familyRent(null, null);
    }
}