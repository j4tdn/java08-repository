package sorting;

import java.util.Arrays;

public class Ex01 {

	// int[], String, Item[] id, name
	public static void main(String[] args) {
		int[] numbers = {1, 5, 9, 4, 6, 11};
		
		// sort manually: bubble sort
//		sort(numbers);
//		Arrays.stream(numbers).forEach(number -> System.out.print(number + " "));
		
		// Arrays.sort(quick-sort)
		Arrays.sort(numbers);	// only sort ASC for non-Object		
		Arrays.stream(numbers).forEach(number -> System.out.print(number + " "));
	}
	
	private static void sort(int[] numbers) {
		for (int out = numbers.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				if (numbers[in] < numbers[out]) {
					int tmp = numbers[in];
					numbers[in] = numbers[out];
					numbers[out] = tmp;
				}
			}
		}
	}
}