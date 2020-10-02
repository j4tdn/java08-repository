package java08.collection.list;

import java08.bean.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A3 {
    public static void main(String[] args) {
        List<Item> items = getItems();

        //remove
        //items.remove(new Item(2, "B"));

        items.set(0, new Item(7, "X"));
        System.out.println("size:" + items.size());
    }

    private static List<Item> getItems() {
       /* List<Item> items = new ArrayList<>();
        items.add(new Item(1, "A"));
        items.add(new Item(2, "B"));
        items.add(new Item(3, "b"));
        items.add(new Item(4, "a"));
        items.add(new Item(5, "Z"));
        items.add(new Item(6, "k"));

        return items;*/

        // dynamic list, fixed size
         return Arrays.asList(new Item(1, "A"), new Item(2, "B"), new Item(3, "b"), new Item(4, "a"), new Item(5, "Z"));

        // unmodifiable, immutable
//        return List.of(new Item(1, "A"), new Item(2, "B"), new Item(3, "b"), new Item(4, "a"), new Item(5, "Z"));
    }
}
