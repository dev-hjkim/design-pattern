package me.whiteship.designpatterns._02_structural_patterns._10_facade._04_practice;

public class TheaterLights {

    public void dim(int percentage) {
        System.out.println("조명 밝기를 " + percentage + "%로 설정합니다.");
    }

    public void on() {
        System.out.println("조명이 켜졌습니다.");
    }
}
