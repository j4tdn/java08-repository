package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Ex02 {

    //int[], String[], Item[]
    public static void main(String[] args) {
        String[] sequences = {"1", "0", null, "X", "10", "2", "Y", "3"};

        //sort manually: bubble sort
//        Arrays.sort(sequences, (o1, o2) -> {
//            // null last
//            if (o1 == null) {
//                return o2 == null ? 0 : -1;
//            }
//            if (o2 == null) {
//                return 1;
//            }
//            //asc
//            return o1.compareTo(o2);
//        });

        Arrays.sort(sequences, Comparator.nullsFirst(Comparator.comparing(Function.identity())));

        Arrays.stream(sequences).forEach(number -> System.out.print(number + " "));

        //Arrays.sort (quick-sort)
        // Arrays.sort(sequences);
        // Arrays.stream(sequences).forEach(number -> System.out.println(number));
    }

    private static void sort(String[] sequences) {
        for (int out = sequences.length - 1; out > 0; out--) {
            for (int in = 0; in < out; in++) {
                if (sequences[in] == null) {
                    continue;
                }
                if (sequences[out] == null || sequences[in].compareTo(sequences[out]) > 0) {
                    String temp = sequences[in];
                    sequences[in] = sequences[out];
                    sequences[out] = temp;
                }
            }
        }
    }
}
