package com.intivefdv.model;

public interface Bike<T extends Number> {

    double FAMILY_DISCOUNT = 0.7;

    Double rent(T quantity);

    Double familyRent(T quantity, Integer rentals);
}
