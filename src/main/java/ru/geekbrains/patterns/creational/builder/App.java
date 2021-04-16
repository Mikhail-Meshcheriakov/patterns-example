package ru.geekbrains.patterns.creational.builder;

public class App {
    public static void main(String[] args) {
        Address address = new AddressBuilder()
                .setCity("Барнаул")
                .setStreet("проспект Ленина")
                .setHouseNumber(27)
                .setApartmentNumber(57)
                .build();

        System.out.println(address.toString());
    }
}
