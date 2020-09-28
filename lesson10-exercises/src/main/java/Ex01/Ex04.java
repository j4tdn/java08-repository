package Ex01;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int[] arrayNumbers = { 1, 2, 4 };
		Arrays.sort(arrayNumbers);
		if (arrayNumbers.length >= 3) {
			System.out.println(arrayNumbers[arrayNumbers.length - 3]);
		} else {
			System.out.println("there is no 3rd largest element");
		}
	}
}
