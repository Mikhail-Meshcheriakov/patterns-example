package ru.geekbrains.patterns.behavioral.command;

public class LandingCommand implements Command {
    AirPlane airPlane;

    public LandingCommand(AirPlane airPlane) {
        this.airPlane = airPlane;
    }

    @Override
    public void execute() {
        airPlane.landing();
    }
}
