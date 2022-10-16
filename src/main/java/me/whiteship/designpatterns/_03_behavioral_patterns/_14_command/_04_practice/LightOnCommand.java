package me.whiteship.designpatterns._03_behavioral_patterns._14_command._04_practice;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.on();
    }
}
