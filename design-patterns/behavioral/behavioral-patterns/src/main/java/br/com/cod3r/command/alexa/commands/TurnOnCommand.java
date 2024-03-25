package br.com.cod3r.command.alexa.commands;

import br.com.cod3r.command.alexa.commands.Command;
import br.com.cod3r.command.alexa.lights.GenericLight;

public class TurnOnCommand implements Command {
    private final GenericLight light;

    public TurnOnCommand(GenericLight light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.turnOn();
    }
}
