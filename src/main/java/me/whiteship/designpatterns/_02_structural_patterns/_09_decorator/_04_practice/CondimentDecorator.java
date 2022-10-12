package me.whiteship.designpatterns._02_structural_patterns._09_decorator._04_practice;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;
    public abstract String getDescription();
}
