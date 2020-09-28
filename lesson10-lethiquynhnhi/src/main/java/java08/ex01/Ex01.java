package java08.ex01;

import java08.App;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Ex01 {
    /**
     * Tạo mảng số nguyên ngẫu nhiên gồm 10 phần tử. Viết các phương thức:
     * 1.Loại bỏ những phần tử trùng nhau trong mảng
     * VD: {1,2,3,4,3,1} Kết quả: {2,4}
     * 2.So sánh giá trị trung bình của 5 phần tử đầu tiên so với 5 phần tử cuối cùng
     * 3.Sắp xếp mảng theo thứ tự tăng dần sử dụng sắp xếp kiểu chèn insertion sort
     * 4.Tìm số lớn thứ 3 trong mảng
     **/
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 9, 4, 10, 2, 8, 10, 15};
        int[] distinctArray = distinctArray(array);
        System.out.println("1.Loai bo phan tu trung nhau trong mang:");
        App.printArray(distinctArray);
        System.out.println();
        System.out.println("==================");
        System.out.println("2.So sanh gia tri trung binh cua 5 phan tu dai tin so voi 5 phan tu cuoi cung:");
        compareAverageof5Element(array);

        System.out.println("====================");
        System.out.println("3. Sap xep mang theo thu tu tang dan su dung sap xep kieu chen insertion sort:");
        int[] insertionSortArray = insertionSort(array);
        App.printArray(insertionSortArray);
        System.out.println();
        System.out.println("====================");
        System.out.println("4. Tim so lon thu 3 trong mang: " + thirdLargestNumber(array, 3));
    }

    private static int[] distinctArray(int[] array) {
        int[] result = new int[array.length];
        int rindex = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i] && i != j) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result[rindex++] = array[i];
            }
        }
        return Arrays.copyOfRange(result, 0, rindex);
    }

    private static void compareAverageof5Element(int[] array) {
        int sumAverageOf5FirstElement = sumArray(array, 0, 5) / 5;
        System.out.println("sumAverageOf5FirstElement" + sumAverageOf5FirstElement);
        int sumAverageOf5LastElement = sumArray(array, 5, array.length) / 5;
        System.out.println("sumAverageOf5LastElement" + sumAverageOf5LastElement);
        if (sumAverageOf5FirstElement > sumAverageOf5LastElement) {
            System.out.print("sumAverageOf5FirstElement bigger sumAverageOf5LastElement");
        } else if (sumAverageOf5FirstElement < sumAverageOf5LastElement) {
            System.out.println("sumAverageOf5FirstElement smaller sumAverageOf5LastElement");
        } else {
            System.out.println("sumAverageOf5FirstElement equal sumAverageOf5LastElement");
        }
    }

    private static int[] insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }

    private static int thirdLargestNumber(int[] array, int n) {
        int[] result = Arrays.stream(array).sorted().toArray();

        return result[result.length - n];
    }

    private static int sumArray(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }
}
