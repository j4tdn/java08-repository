package java08.ex04;

import java08.App;

public class Ex04 {
    /**
     * Cho mảng số nguyên int có n phần tử ngẫu nhiên. Viết chương trình thực hiện
     * a. Thêm phần tử vào vị trí thứ k (0 < k < n-1)
     * b. Xóa phần tử tại vị trí thứ k (0 < k < n-1)
     */

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5};
        int number = 4;
        int k = 2;
        int[] addTheKthElementArray = addTheKthElement(array, number, k);
        System.out.println("a. Them phan tu vao vi tri thu k:");
        App.printArray(addTheKthElementArray);
        System.out.println();
        System.out.println("=========================");
        System.out.println("b. Xoa phan tu tai vi tri thu k:");
        int[] deleteTheKthElementArray = deleteTheKthElement(array, k);
        App.printArray(deleteTheKthElementArray);
    }

    private static int[] addTheKthElement(int[] array, int number, int k) {
        int[] result = new int[array.length + 1];

        for (int i = 0; i < result.length; i++) {
            if (i < number) {
                result[i] = array[i];
            }
            if (i == k) {
                result[i] = number;
            }
            if (i > k) {
                result[i] = array[i - 1];
            }
        }
        return result;
    }

    private static int[] deleteTheKthElement(int[] array, int k) {
        int[] result = new int[array.length - 1];
        for (int i = 0; i < result.length; i++) {
            if (i < k) {
                result[i] = array[i];
            }
            if (i >= k) {
                result[i] = array[i + 1];
            }
        }

        return result;
    }

}
