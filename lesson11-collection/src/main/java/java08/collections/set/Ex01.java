package java08.collections.set;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
    public static void main(String[] args) {
        Set<Integer> digits = new HashSet<>();
        digits.add(5);
        digits.add(13);
        digits.add(7);
        digits.add(8);

        System.out.println("Size: " + digits.size());

        // move to Iterator: Iterator là lặp
        Integer firstDigit = digits.iterator().next();
        System.out.println("first digit: " + firstDigit);
    }
}
