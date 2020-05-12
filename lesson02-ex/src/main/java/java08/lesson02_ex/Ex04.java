package java08.lesson02_ex;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int[] numbers = { 1, 5, 7, 4, 9, 6, 3 };
	
		System.out.println("So lon thu 2: " + secondNumber(numbers));
	}
	private static int secondNumber(int[] array) {
		int max1 = 0, max2 = 0;
		int[] array2 = new int[20];
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1 && array[i] > max1) {
				max1 = array[i];
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1 && array[i] > max2 && array[i] < max1) {
				max2 = array[i];
			}
		}
		return max2;
	}
}
