package ru.geekbrains.patterns.creational.builder;

import java.util.ArrayList;

public class AddressBuilder {


    private String city;
    private String street;
    private int houseNumber;
    private int apartmentNumber;

    public AddressBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public AddressBuilder setStreet(String street) {
        this.street = street;
        return this;
    }

    public AddressBuilder setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    public AddressBuilder setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
        return this;
    }

    public Address build() {
        return new Address(city, street, houseNumber, apartmentNumber);
    }
}