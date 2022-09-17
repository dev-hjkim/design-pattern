package me.whiteship.designpatterns._03_behavioral_patterns._21_strategy._05_quiz;

public abstract class Character {
    WeaponBehavior weapon;

    public Character(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public abstract void fight();

    public void setWeapon(WeaponBehavior w) {
        this.weapon = w;
    }
}
