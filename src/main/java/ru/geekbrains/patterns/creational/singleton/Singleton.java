package ru.geekbrains.patterns.creational.singleton;

public class Singleton {
    private static final Singleton instance;

    public static Singleton getInstance() {
        return instance;
    }
}
