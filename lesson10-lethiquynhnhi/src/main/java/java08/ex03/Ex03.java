package java08.ex03;

import java.util.Arrays;

public class Ex03 {
    public static String SPECIAL_STRING = "Special";

    public static void main(String[] args) {
        String[] sequences = {"1", null, "a", "0", null, "X", "Special", "10", "Special", "2", "Y", "-3", "3"};

        System.out.println("Mang String tang dan:");
        String[] ascendingArray = ascendingArray(sequences, SPECIAL_STRING);
        printArray(ascendingArray);
        System.out.println();
        System.out.println("========================");
        System.out.println("Mang String giam dan:");
        String[] descendingArray = descendingArray(sequences, SPECIAL_STRING);
        printArray(descendingArray);
    }

    private static String[] ascendingArray(String[] sequences, String specialString) {
        Arrays.sort(sequences, (o1, o2) -> sort(o1, o2, SPECIAL_STRING));
        return sequences;
    }

    private static String[] descendingArray(String[] sequences, String specialString) {
        Arrays.sort(sequences, (o1, o2) -> sort(o2, o1, SPECIAL_STRING));
        return sequences;
    }

    private static int sort(String o1, String o2, String specialString) {
        // null last
        if (o2 == null) {
            return o1 == null ? 0 : -1;
        }
        if (o1 == null) {
            return 1;
        }
        if (o1 == specialString) {
            return o2 == specialString ? 0 : -1;
        }
        if (o2 == specialString) {
            return 1;
        }
        try {
            int number2 = Integer.parseInt(o2);
            int number1 = Integer.parseInt(o1);
            return number1 - number2;
        } catch (Exception e) {
            e.getMessage();
        }
        //asc
        return o1.compareTo(o2);
    }

    private static void printArray(String[] array) {
        for (String i : array) {
            System.out.print(i + " ");
        }
    }
}
