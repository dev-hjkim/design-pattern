package me.whiteship.designpatterns._03_behavioral_patterns._20_state._04_practice;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
