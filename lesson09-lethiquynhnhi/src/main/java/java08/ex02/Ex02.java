package java08.ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex02 {

    public static void main(String[] args) {
        Integer[] array = getLargestNumbers("01a2b3456cde478", "01a2b4789cde3456");
        array = Arrays.stream(array).sorted().toArray(Integer[]::new);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static Integer[] getLargestNumbers(String... arrayString) {
        List<Integer> numbers = new ArrayList<Integer>();
        for (String s : arrayString) {
            int max = 0;
            String[] result = s.split("[a-z]+");

            int number = 0;
            for (int j = 0; j < result.length; j++) {
                number = Integer.parseInt(result[j]);
                if (number >= max) {
                    max = number;
                }
            }
            numbers.add(max);
        }
        return numbers.toArray(new Integer[numbers.size()]);

    }
}
