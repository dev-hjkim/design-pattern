package me.whiteship.designpatterns._03_behavioral_patterns._21_strategy._05_quiz;

public class ActionAdventureSimulator {
    public static void main(String[] args) {
        Character queen = new Queen(new KnifeBehavior());
        queen.fight();

        queen.setWeapon(new BowAndArrowBehavior());
        queen.fight();
    }
}
