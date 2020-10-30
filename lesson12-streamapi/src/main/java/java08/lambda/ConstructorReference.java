package java08.lambda;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ConstructorReference {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        stream.forEach(System.out::println);
        stream.forEach(System.out::println);


        Supplier<Item> noArgs = Item::new;
        Item item1 = noArgs.get();
        System.out.println("item1: " + item1.getId());
        Function<Integer, Item> oneArgs = Item::new;
        Item item2 = oneArgs.apply(1);
        System.out.println("item2: " + item2.getId());
    }

}

class Item {
    private int id;

    public Item() {
        System.out.println("NoArgs");
    }

    public Item(int id) {
        System.out.println("OneArgs");
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
