package declaration;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.IntPredicate;

public class Ex02 {
	public static void main(String[] args) {
		// tim cac phan tu le trong mang
		int[] digits = { 1, 7, 2, 9, 11, 12 };
		int[] odddigits = getoddDigits(digits);
		printf(odddigits);

		// cach 2: stream
		int[] odddigit2 = Arrays.stream(digits).filter(digit -> digit % 2 != 0).toArray();
		System.out.println("\n=============");
		printf(odddigit2);

		// cal sum
		int sum = Arrays.stream(digits).filter(digit -> digit % 2 == 0).sum();
		System.out.println("\n=============");
		System.out.println("sum:" + sum);

		// find max
		OptionalInt opMax = Arrays.stream(digits).max();
		System.out.println("\n=============");
		System.out.println("max:" +opMax.orElse(0));

	}

	private static void printf(int[] digits) {
		for (int i : digits) {
			System.out.print(i + " ");
		}
	}

	private static int[] getoddDigits(int[] digits) {
		int[] result = new int[digits.length];
		int index = 0;
		for (int i : digits) {
			if (i % 2 != 0) {
				result[index++] = i;
			}

		}
		return Arrays.copyOfRange(result, 0, index);
	}

}
