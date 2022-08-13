package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._04_practice;

public abstract class PizzaStore {
//    SimplePizzaFactory factory;

//    public PizzaStore(SimplePizzaFactory factory) {
//        this.factory = factory;
//    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

//        pizza = factory.createPizza(type);
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
