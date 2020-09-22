package sorting;

import java.util.Arrays;

public class Ex01 {

	// int[], String[], Item[] id, name
	public static void main(String[] args) {
		int[] numbers = { 1, 5, 9, 4, 6, 11 };
//		sort(numbers);
		Arrays.sort(numbers);
		
		Arrays.stream(numbers).forEach(number -> System.out.print(number + " "));
		// sort manually: bubble sort
		// Arrays.sort (quick-sort)
		
	}
	
	public static void sort(int[] numbers) {
		for (int out = numbers.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				if (numbers[in] > numbers[out]) {
					int temp = numbers[in];
					numbers[in] = numbers[out];
					numbers[out] = temp;
				}
			}
		}
	}

}
