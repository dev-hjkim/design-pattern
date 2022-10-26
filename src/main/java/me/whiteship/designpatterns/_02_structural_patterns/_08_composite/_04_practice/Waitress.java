package me.whiteship.designpatterns._02_structural_patterns._08_composite._04_practice;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        this.allMenus.print();
    }
}
