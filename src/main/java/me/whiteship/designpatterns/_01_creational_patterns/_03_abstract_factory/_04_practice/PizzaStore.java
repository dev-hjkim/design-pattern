package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._04_practice;

public abstract class PizzaStore {
    abstract Pizza createPizza(String item);

    public void orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
