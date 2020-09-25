package declaration;

import java.util.Arrays;
import java.util.OptionalInt;

public class Ex02 {
	public static void main(String[] args) {
		// In ra các phần tử lẻ trong mảng
		int[] digits = { 1, 7, 2, 9, 11, 12 };
		int[] oddDigits = getOddDigits(digits);
		printf(oddDigits);
		System.out.println("\n==========================\n");

		// 2nd way: stream
		int[] oddDigits2nd = Arrays.stream(digits).filter(digit -> digit % 2 != 0).toArray();
		printf(oddDigits2nd);

		// cal sum
		int sum = Arrays.stream(digits).filter(digit -> digit % 2 == 0).sum();
		System.out.println("Sum = " + sum);

		// find max
		OptionalInt optionalInt = Arrays.stream(digits).max();
		System.out.println("max : " + optionalInt.orElse(0));
	}

	private static void printf(int[] digits) {
		for (int digit : digits) {
			System.out.print(digit + "  ");
		}
		System.out.print("\n");
	}

	private static int[] getOddDigits(int[] digits) {
		int[] result = new int[digits.length];
		int rIndex = 0;

		for (int digit : digits) {
			if (digit % 2 != 0) {
				result[rIndex++] = digit;
			}
		}

		return Arrays.copyOfRange(result, 0, rIndex);
	}
}