package me.whiteship.designpatterns._02_structural_patterns._08_composite._04_practice;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    List<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        this.menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        this.menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return this.menuComponents.get(i);
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("----------------------");

        for (MenuComponent menuComponent : this.menuComponents) {
            menuComponent.print();
        }
    }
}
