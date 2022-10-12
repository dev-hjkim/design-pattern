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
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += 0.1;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += 0.15;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += 0.2;
        }
        return cost;
    }
}
