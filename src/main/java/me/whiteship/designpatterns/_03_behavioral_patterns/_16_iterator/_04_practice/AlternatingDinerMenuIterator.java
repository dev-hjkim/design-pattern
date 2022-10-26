package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._04_practice;

import java.util.Calendar;
import java.util.Iterator;

public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        this.position = Calendar.DAY_OF_WEEK % 2;
    }

    public MenuItem next() {
        MenuItem menuItem = this.items[this.position];
        this.position += 2;
        return menuItem;
    }

    public boolean hasNext() {
        return this.position < this.items.length && this.items[position] != null;
    }

    public void remove() {
        throw new UnsupportedOperationException(
                "remove()는 지원하지 않습니다."
        );
    }
}
