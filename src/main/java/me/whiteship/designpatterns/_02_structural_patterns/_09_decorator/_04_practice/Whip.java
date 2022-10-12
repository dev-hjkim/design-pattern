package me.whiteship.designpatterns._02_structural_patterns._09_decorator._04_practice;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.description = "휘핑크림";
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", " + this.description;
    }

    public double cost() {
        return beverage.cost() + 0.1;
    }


}
