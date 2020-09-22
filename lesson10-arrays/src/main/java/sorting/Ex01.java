
package sorting;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		int[] number = { 1, 5, 9, 4, 2, 11 };
		sort(number);
		
		Arrays.sort(number);
		Arrays.stream(number).forEach(numbers -> System.out.print("  "+numbers));
		
		// sort manually: bubble sort
		// Array.sort(quick-sort)
	}

	private static void sort(int[] numbers) {
		for (int out = numbers.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				if(numbers[in] > numbers[out]) {
					int tmp = numbers[in];
					numbers[in] = numbers[out];
					numbers[out] =tmp;
				}

			}
		}
	}

}