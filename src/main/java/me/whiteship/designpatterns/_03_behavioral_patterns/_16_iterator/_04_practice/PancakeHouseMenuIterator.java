package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._04_practice;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position += 1;
        return menuItem;
    }

    public boolean hasNext() {
        return position < items.size() && items.get(position) != null;
    }
}
