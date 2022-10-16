package me.whiteship.designpatterns._03_behavioral_patterns._14_command._04_practice;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.off();
    }
}
