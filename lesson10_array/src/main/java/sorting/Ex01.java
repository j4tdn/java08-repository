package sorting;

import java.util.Arrays;

//int[] , String[], Item[]

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = {1, 5,6,3,8,2};
		//sort(numbers);
		Arrays.sort(numbers);
		Arrays.stream(numbers).forEach(number -> System.out.print(number + " "));
		
	}
	
	
	public static void sort(int[] numbers) {
		for(int out = numbers.length-1;out>0;out--) {
			for(int in = 0; in<out ; in++) {
				if(numbers[in] > numbers[out]) {
					int tmp = numbers[in];
					numbers[in] = numbers[out];
					numbers[out] = tmp;
				}
			}
		}
	}

}
