package declaration;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		// In cac phan tu le trong mang
		int[] digits = { 1, 7, 2, 9, 8, 12 };

		int[] oddDigits = getOddDigits(digits);
		printArr(oddDigits);
		
		System.out.println("\n==========================");

		// 2nd
		int[] evenDigits = Arrays.stream(digits).filter(x -> x % 2 == 0).toArray();

		// cal Sum
		
		int sum = Arrays.stream(digits).filter(x -> x % 2 == 0).sum();
		System.out.println("sum: " + sum);
		
		// find max
		int max = Arrays.stream(digits).max().orElse(0);
		

	}

	private static void printArr(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	private static int[] getOddDigits(int[] digits) {
		int[] result = new int[digits.length];
		int index = 0;
		for (int digit : digits) {
			if (digit % 2 != 0) {
				result[index++] = digit;
			}
		}

		return Arrays.copyOfRange(result, 0, index);
	}
}
