package ru.geekbrains.patterns.behavioral.command;

public class Invoker {
    private Command takeOffCommand;
    private Command landingCommand;

    public Invoker(Command takeOffCommand, Command landingCommand) {
        this.takeOffCommand = takeOffCommand;
        this.landingCommand = landingCommand;
    }

    public void takeOff() {
        takeOffCommand.execute();
    }

    public void landing() {
        landingCommand.execute();
    }
}
