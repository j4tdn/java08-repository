package sorting;

import java.util.Arrays;

public class Ex01 {
	// int[], String[], Item[], id, name
	public static void main(String[] args) {
		int[] numbers = { 1, 5, 7, 9, 4, 6, 11 };
//		sort(numbers);
		
		
		// sort manually: bubble sort
		// Array.sort (quick-sort)
		Arrays.sort(numbers); // ASC, java have not DESC
		Arrays.stream(numbers).forEach(value -> {System.out.println(value);});
	}
	
	private static void sort(int[]  numbers) {
		for (int out = numbers.length -1; out > 0; out++) {
			for (int in = 0; in < out; in++) {
				if(numbers[in] > numbers[out]) {
					int tmp = numbers[in];
					numbers[in] = numbers[out];
					numbers[in]=  tmp;
				}
				
			}
		}
		
	}
}
