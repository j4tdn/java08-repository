package sorting;

import java.util.Arrays;

public class Ex01 {
	//int[], String[], Item[]
	public static void main(String[] args) {
		int[] numbers = {1, 5, 9, 4, 6, 11};
		//sort(numbers);
		Arrays.sort(numbers); //ASC Kiểu nguyên thủy java chỉ hỗ trợ sort tăng dần
		Arrays.stream(numbers).forEach(number -> System.out.print(number + " "));
		//sorting manually: bubble sort
		//Arrays.sort (quick-sort)
		

	}
	
	private static void sort(int[] numbers) {
		for (int out = numbers.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				if(numbers[in] < numbers[out]) {
					int tmp = numbers[in];
				    numbers[in] = numbers[out];
				    numbers[out] = tmp;
				}
			}
			
		}
	}

}
