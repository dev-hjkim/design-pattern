package me.whiteship.designpatterns._03_behavioral_patterns._21_strategy._04_practice;

public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("로켓 추진으로 날아갑니다.");
    }
}
