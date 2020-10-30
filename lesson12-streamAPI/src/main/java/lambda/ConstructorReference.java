package lambda;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ConstructorReference {

    public static void main(String[] args) {
        Supplier<Item> noArg = Item::new;

        Function<Integer,Item> oneArg = Item::new;

        Item item1 = noArg.get();

        Item item2  = oneArg.apply(10);

        System.out.println(item1.getId());
        System.out.println(item2.getId());


        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        stream.forEach(System.out::println);
        stream.forEach(System.out::println);


}

static class Item {
        private int id ;

        public int getId(){
            return this.id ;
        }

        public Item(){
            System.out.println("no arg");
        }


    public Item(int id){
        System.out.println("one arg");
        this.id = id ;
    }
}
}
