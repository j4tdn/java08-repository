package Ex01;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		int[] arrayNumbers = { 1, 2, 4, 5, 4, 9, 88 };
		insertSort(arrayNumbers);
		Arrays.stream(arrayNumbers).forEach(value -> System.out.print(value + " "));
	}

	public static void insertSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				int tmp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = tmp;
			}
		}
	}
}
