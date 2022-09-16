package me.whiteship.designpatterns._03_behavioral_patterns._21_strategy._04_practice;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< 조용 ~ >>");
    }
}
