package me.whiteship.designpatterns._03_behavioral_patterns._19_observer._04_practice;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
