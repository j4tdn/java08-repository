package java08.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class A2 {
    public static void main(String[] args) {
        // T : Integer || String
        // T : Student || Employee

        // Tạo mảng số nguyên có 5 phần tử
        // attribute: Object[]
        // capacity

        List<Integer> digits = new ArrayList<>();
        System.out.println("size: " + digits.size());

        //add
        digits.add(1);
        digits.add(7);
        digits.add(3);
        digits.add(15);
        digits.add(5);
        digits.add(2);
        System.out.println("size: " + digits.size());

        //remove
        digits.remove(0);
        digits.remove(new Integer(5));

        //removeIf
        Iterator<Integer> iterator = digits.iterator();
        while (iterator.hasNext()) {
            Integer digit = iterator.next();
            if (digit % 2 == 0) {
                iterator.remove();
            }
        }

        digits.removeIf(digit -> digit % 5 == 0);

        System.out.println("Index 0: " + digits.get(0));
        digits.set(0, 11);
        digits.stream().forEach(System.out::println);

        System.out.println("contains: " + digits.contains(11));

    }

}
