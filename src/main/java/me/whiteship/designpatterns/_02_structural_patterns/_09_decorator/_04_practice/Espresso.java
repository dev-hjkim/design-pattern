package me.whiteship.designpatterns._02_structural_patterns._09_decorator._04_practice;

public class Espresso extends Beverage {
    public Espresso() {
        this.description = "에스프레소";
    }

    public double cost() {
        return 1.99;
    }
}
