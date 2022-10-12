package me.whiteship.designpatterns._02_structural_patterns._09_decorator._04_practice;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        this.description = "하우스 블렌드";
    }

    public double cost() {
        return 0.89;
    }
}
