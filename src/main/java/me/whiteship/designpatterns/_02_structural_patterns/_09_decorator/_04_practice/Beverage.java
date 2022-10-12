package me.whiteship.designpatterns._02_structural_patterns._09_decorator._04_practice;

public abstract class Beverage {
    public enum Size { TALL, GRANDE, VENTI };
    Size size = Size.TALL;
    protected String description = "제목 없음";

    public String getDescription() {
        return this.description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public abstract double cost();
}
