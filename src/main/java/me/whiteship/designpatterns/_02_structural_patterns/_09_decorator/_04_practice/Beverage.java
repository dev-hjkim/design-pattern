package me.whiteship.designpatterns._02_structural_patterns._09_decorator._04_practice;

public abstract class Beverage {
    protected String description = "제목 없음";

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}
