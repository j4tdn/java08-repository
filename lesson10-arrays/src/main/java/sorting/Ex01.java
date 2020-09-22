package sorting;

import java.util.Arrays;

public class Ex01 {

    //int[], String[], Item[]
    public static void main(String[] args) {
        int[] sequences = {1, 5, 9, 4, 6, 11};

        //sort manually: bubble sort
        sort(sequences);
        Arrays.stream(sequences).forEach(number -> System.out.print(number + " "));

        //Arrays.sort (quick-sort)
        Arrays.sort(sequences);
        Arrays.stream(sequences).forEach(number -> System.out.println(number));
    }

    private static void sort(int[] sequences) {
        for (int out = sequences.length - 1; out > 0; out--) {
            for (int in = 0; in < out; in++) {
                if (sequences[in] > sequences[out]) {
                    int temp = sequences[in];
                    sequences[in] = sequences[out];
                    sequences[out] = temp;
                }
            }
        }
    }
}
