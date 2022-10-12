package me.whiteship.designpatterns._02_structural_patterns._09_decorator._04_practice;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.description = "모카";
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", " + this.description;
    }

    public double cost() {
        return beverage.cost() + 0.2;
    }
}
