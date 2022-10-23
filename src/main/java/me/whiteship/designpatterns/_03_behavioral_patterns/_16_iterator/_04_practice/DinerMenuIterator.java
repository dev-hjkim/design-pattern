package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._04_practice;

public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

     public DinerMenuIterator(MenuItem[] items) {
         this.items = items;
     }

     public MenuItem next() {
         MenuItem menuItem = items[position];
         position += 1;
         return menuItem;
     }

     public boolean hasNext() {
         return position < items.length && items[position] != null;
     }
}
