package java08.collections.set;

import java08.bean.Item;

import java.util.*;

public class Ex02 {
    public static void main(String[] args) {
        Item itemA = new Item(11, "A");
        Item itemB = new Item(8, "B");
        Item itemC = new Item(17, "C");
        Item itemD = new Item(18, "D");

        Comparator<Item> comp = new Comparator<Item>() {
            @Override
            public int compare(Item i1, Item i2) {
                if (i1 == null) {
                    return 1;
                }
                if (i2 == null) {
                    return -1;
                }
                return i1.getId() - i2.getId();
            }
        };

        Comparator<Item> comp2 = Comparator.nullsFirst(Comparator.comparing(Item::getId));

        Set<Item> items = new TreeSet<>(comp);
        items.add(itemA);
        items.add(null);
        items.add(itemB);
        items.add(itemC);
        items.add(itemD);

        System.out.println("size: " + items.size());
        items.forEach(item -> {
            System.out.println(item);
        });
    }
}
