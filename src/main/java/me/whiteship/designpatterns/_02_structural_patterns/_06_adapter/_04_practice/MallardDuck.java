package me.whiteship.designpatterns._02_structural_patterns._06_adapter._04_practice;

public class MallardDuck implements Duck {
    public void quack() {
        System.out.println("꽥");
    }

    public void fly() {
        System.out.println("날고 있어요!!");
    }
}
