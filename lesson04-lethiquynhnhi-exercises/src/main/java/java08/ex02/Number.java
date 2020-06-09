package java08.ex02;

public class Number {

    public static void main(String[] args) {
        int[] array = {5, 7, 35, 49, 25, 11};
        printArray(divide75(array));
    }

    private static void swap(int[] array, int n, int m) {
        int temp = array[n];
        array[n] = array[m];
        array[m] = temp;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static int[] divide75(int[] array) {
        int first = 0;
        int last = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 7 == 0 && array[i] % 5 != 0) {
                swap(array, i, first);
                first++;
            }
            if (array[i] % 7 != 0 && array[i] % 5 == 0) {
                swap(array, i, last);
                last--;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 35 == 0 || (array[i] % 5 != 0 && array[i] % 7 != 0)) {
                swap(array, i, first);
                first++;
            }
        }
        return array;

    }
}
