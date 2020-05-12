package java08;

import java.util.Random;

public class Ex07 {
    public static void main(String[] args) {
        int[] array = randomNumber();
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static int[] randomNumber() {
        Random rd = new Random();
        int[] array = new int[5];
        int test = 0;
        int count = 0;
        while (count < array.length) {
            test = 20 + rd.nextInt(30 - 20 + 1);
            if (containArray(array, test)) {
                continue;
            }
            array[count++] = test;
            if (count == 5) {
                break;
            }
        }
        return array;
    }

    private static boolean containArray(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }
}
