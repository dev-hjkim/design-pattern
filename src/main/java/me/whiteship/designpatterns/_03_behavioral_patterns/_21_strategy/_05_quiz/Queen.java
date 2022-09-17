package me.whiteship.designpatterns._03_behavioral_patterns._21_strategy._05_quiz;

public class Queen extends Character {

    public Queen(WeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
