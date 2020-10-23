package collections.set;

import Bean.Item;

import java.util.*;

public class Ex02 {
    public static void main(String[] args) {
        Item itemA = new Item(11,"A");
        Item itemB= new Item(8,"D");
        Item itemE = null ;
        Item itemC = new Item(17,"B");
        Item itemD = new Item(8,"D");

        //Set<Item> items = new HashSet<>();



        Comparator<Item> cmp = new Comparator<Item>() {
            @Override
            public int compare(Item i1, Item i2) {
                if(i2==null){
                    return i1 ==null ? 0 : -1 ;
                }
                //
                if(i1 == null ){
                    return 1;
                }
                return i1.getId() - i2.getId();

            }
        };

//        Comparator<Item> cmp = Comparator.nullsFirst(Comparator.comparing(Item::getId));


           // HashSet , LinkedHashSet , TreeSet

        Set<Item> items = new TreeSet<>(cmp);
        // TreeSet nay thi no se sap xep giong nhu Arrays.sort(items);

        items.add(itemA);
        items.add(itemB);
        items.add(itemC);
        items.add(itemD);
        System.out.println(items.size());

        items.forEach(t -> System.out.println(t));

        //MEMORY :
            // khi cung hashcode ( true) thi khong add vao memory
        // MAP :
            // khi cung equals ( true)  thi khong add



    }
}
