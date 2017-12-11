package com.intivefdv.model;

public class BikeWeek implements Bike<Integer> {

    private static final int PRICE_PER_WEEK = 60;

    public Double rent(Integer weeks) {
        return (double) (weeks * PRICE_PER_WEEK);
    }

    public Double familyRent(Integer weeks, Integer rentals) {
        return FAMILY_DISCOUNT*PRICE_PER_WEEK*weeks*rentals;
    }
}
