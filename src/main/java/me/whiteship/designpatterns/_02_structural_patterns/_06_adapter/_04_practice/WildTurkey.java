package me.whiteship.designpatterns._02_structural_patterns._06_adapter._04_practice;

public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("골골");
    }

    public void fly() {
        System.out.println("짧은 거리를 날고 있어요!");
    }
}
