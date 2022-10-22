package me.whiteship.designpatterns._03_behavioral_patterns._22_template._04_practice;

public class Tea extends CaffeineBeverage {
    public void brew() {
        System.out.println("찻잎을 우려내는 중");
    }

    public void addCondiments() {
        System.out.println("레몬을 추가하는 중");
    }
}
