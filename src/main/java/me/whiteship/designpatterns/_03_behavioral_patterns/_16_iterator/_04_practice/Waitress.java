package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._04_practice;

import java.util.Iterator;
import java.util.List;

public class Waitress {
    List<Menu> menus;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        for (Menu menu : this.menus) {
            printMenu(menu.createIterator());
            System.out.println("----------");
        }
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
