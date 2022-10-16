package me.whiteship.designpatterns._03_behavioral_patterns._14_command._04_practice;

public class Light {
    String location;

    public Light(String location) {
        if (location.equals("Living Room")) {
            this.location = "거실";
        } else if (location.equals("Kitchen")) {
            this.location = "주방";
        } else {
            this.location = "";
        }
    }

    public void on() {
        System.out.println(this.location + " 조명이 켜졌습니다.");
    }

    public void off() {
        System.out.println(this.location + " 조명이 꺼졌습니다.");
    }
}
