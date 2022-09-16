package me.whiteship.designpatterns._03_behavioral_patterns._21_strategy._04_practice;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("저는 못 날아요.");
    }
}
