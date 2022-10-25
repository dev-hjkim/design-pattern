package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._04_practice;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
