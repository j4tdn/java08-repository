package declaration;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.IntPredicate;

public class Ex02 {
	public static void main(String[] args) {
		int[] digits = { 1, 7, 2, 9, 11, 12 };

		// Tìm các phần tử lẻ trong mảng
		int[] oddDigits = getOddDigits(digits);
		printf(oddDigits);

		System.out.println("\n==========");
		// 2nd way: stream
		int[] oddDigits2nd = Arrays.stream(digits)
				.filter(digit -> digit % 2 != 0)
				.toArray();
		printf(oddDigits2nd);
		
		//call sum
		int sum = Arrays.stream(digits)
			.filter(digit -> digit %2 == 0)
			.sum();
		System.out.println("sum: " + sum);

		// find max
		OptionalInt optionalMax = Arrays.stream(digits).max();
		System.out.println("max: " + optionalMax.orElse(0));

	}

	private static void printf(int[] digits) {
		for (int digit : digits) {
			System.out.print(digit + " ");
		}
	}

	private static int[] getOddDigits(int[] digits) {
		int[] result = new int[digits.length];
		int ridex = 0;
		for (int digit : digits) {
			if (digit % 2 != 0) {
				result[ridex++] = digit;
			}
		}
		return Arrays.copyOfRange(result, 0, ridex);
	}
}
