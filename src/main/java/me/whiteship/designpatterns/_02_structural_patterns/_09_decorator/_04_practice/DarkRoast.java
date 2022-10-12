package me.whiteship.designpatterns._02_structural_patterns._09_decorator._04_practice;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        this.description = "다크 로스트";
    }

    public double cost() {
        return 0.99;
    }
}
