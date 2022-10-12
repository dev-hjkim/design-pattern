package me.whiteship.designpatterns._02_structural_patterns._09_decorator._04_practice;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
        this.description = "두유";
    }

    public String getDescription() {
        return beverage.getDescription() + ", " + this.description;
    }

    public double cost() {
        return beverage.cost() + 0.15;
    }
}
