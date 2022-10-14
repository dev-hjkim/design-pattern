package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._04_practice;

public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("peppeoni")) {
            return new ChicagoStylePepperoniPizza();
        } else {
            return null;
        }
    }

}
