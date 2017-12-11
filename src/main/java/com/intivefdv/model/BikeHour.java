package com.intivefdv.model;

public class BikeHour implements Bike<Integer>{

    private static final int PRICE_PER_HOUR = 5;

    public Double rent(Integer hours) {
        return (double) (hours * PRICE_PER_HOUR);
    }

    public Double familyRent(Integer hours, Integer rentals) {
        return FAMILY_DISCOUNT*PRICE_PER_HOUR*hours*rentals;
    }
}
