package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._04_practice;

public class MenuItem {
    private final String name;
    private final String description;
    private final boolean vegetarian;
    private final double price;


    public MenuItem(String name,
                    String description,
                    boolean vegetarian,
                    double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isVegetarian() {
        return this.vegetarian;
    }
}
