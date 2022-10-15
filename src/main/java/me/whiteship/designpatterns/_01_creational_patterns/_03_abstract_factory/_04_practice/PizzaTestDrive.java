package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._04_practice;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");
        System.out.println("=====================");
        nyPizzaStore.orderPizza("clam");
    }
}
