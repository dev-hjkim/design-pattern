package me.whiteship.designpatterns._03_behavioral_patterns._14_command._04_practice;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        this.stereo.off();
    }

    public void undo() {
        this.stereo.off();
    }
}
