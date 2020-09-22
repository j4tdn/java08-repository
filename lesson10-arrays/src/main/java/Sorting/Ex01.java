package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class Ex01 {
	// int[], String, Item[] id, name
	public static void main(String[] args) {
		int[] number = { 1, 5, 8, 3, 2, 9 };

		// sort manually
		//sort(number);
		
		// sort(number: ASC
		Arrays.sort(number);


		Arrays.stream(number).forEach(System.out::println);

	}

	private static void sort(int[] number) {
		for (int i = 0; i < number.length; i++) {
			for (int j = i; j < number.length; j++) {
				if (number[i] > number[j]) {
					int temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
	}
}
