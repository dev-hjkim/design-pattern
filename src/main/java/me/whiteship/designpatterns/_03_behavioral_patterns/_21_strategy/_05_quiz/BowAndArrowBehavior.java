package me.whiteship.designpatterns._03_behavioral_patterns._21_strategy._05_quiz;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Used bow and arrow!! Damage 8");
    }
}
