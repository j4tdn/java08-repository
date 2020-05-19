package java08;

public class Ex04 {
    /*
    Viết chương trình nhập vào một dãy các số nguyên từ bàn phím.
    Tìm số lẻ lớn nhất thứ hai trong dãy số và in ra.
    */
    public static void main(String[] args) {
        int[] array = {1, 4, 7, 8, 9};
        System.out.println("So le lon nhat thu hai la: " + secondOddNumber(array));
    }

    private static int secondOddNumber(int[] array) {
        int max = 0;
        int max2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && array[i] > max) {
                max2 = max;
                max = array[i];
            }
        }
        return max2;
    }
}
