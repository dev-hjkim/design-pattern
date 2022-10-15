package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._04_practice;

public abstract class Pizza {
    String name;

    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    abstract void prepare();

    void bake() {
        System.out.println("175도에서 25분 간 굽기");
    }

    void cut() {
        System.out.println("피자를 사선으로 자르기");
    }

    void box() {
        System.out.println("상자에 피자 담기");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
