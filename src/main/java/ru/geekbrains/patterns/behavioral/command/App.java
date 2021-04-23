package ru.geekbrains.patterns.behavioral.command;

public class App {
    public static void main(String[] args) {
        AirPlane airPlane = new AirPlane();

        Command takeOff = new TakeOffCommand(airPlane);
        Command landing = new LandingCommand(airPlane);

        Invoker invoker = new Invoker(takeOff, landing);

        invoker.takeOff();
        invoker.landing();
    }
}
