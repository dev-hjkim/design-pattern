package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._04_practice;

import java.util.List;

import static java.util.Arrays.asList;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        List<Menu> menus = asList(pancakeHouseMenu, dinerMenu, cafeMenu);

        Waitress waitress = new Waitress(menus);

        waitress.printMenu();
    }
}
