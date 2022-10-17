package me.whiteship.designpatterns._03_behavioral_patterns._14_command._04_practice;

public class NoCommand implements Command {
    public void execute() {
        System.out.println("현재 지정된 행동이 없습니다.");
    }

    public void undo() {
        System.out.println("현재 지정된 행동이 없습니다.");
    }
}
