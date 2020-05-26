package java08.ex02;

public class MissingNumber {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5};
        System.out.println("Missing NUmber: " + getMissingNumber(array));
    }

    private static int getMissingNumber(int[] array) {
        int n = array[array.length - 1];
        int total = (n + 1) * n / 2;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return total - sum;
    }
}
