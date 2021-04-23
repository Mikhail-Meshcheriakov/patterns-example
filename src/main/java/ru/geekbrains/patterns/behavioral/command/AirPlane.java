package ru.geekbrains.patterns.behavioral.command;

public class AirPlane {
    public void takeOff() {
        System.out.println("Самолёт взлетает");
    }

    public void landing() {
        System.out.println("Самолёт приземляется");
    }
}
