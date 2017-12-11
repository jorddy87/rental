package com.intivefdv.model;

public class BikeDay implements Bike<Integer>{

    private static final int PRICE_PER_DAY = 20;

    public Double rent(Integer days) {
        return (double) (days * PRICE_PER_DAY);
    }

    public Double familyRent(Integer days, Integer rentals) {
        return FAMILY_DISCOUNT*PRICE_PER_DAY*days*rentals;
    }
}
