package ru.geekbrains.patterns.behavioral.command;

public class TakeOffCommand implements Command {
    private AirPlane airPlane;

    public TakeOffCommand(AirPlane airPlane) {
        this.airPlane = airPlane;
    }

    @Override
    public void execute() {
        airPlane.takeOff();
    }
}
