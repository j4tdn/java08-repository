package declaration;

import java.util.Arrays;
import java.util.OptionalInt;

public class Ex02 {
	public static void main(String[] args) {
		int[] digit = {  };
		int[] oddDigit = getOddDigits(digit);
		printfs(oddDigit);

		// 2nd way: stream
		int[] oddDigits2Nd = Arrays.stream(digit).filter(value -> value % 2 != 0).toArray();
		printfs(oddDigits2Nd);

		// call sum
		int sum = Arrays.stream(digit).filter(value -> value % 2 == 0).sum();
		System.out.println("sum: " + sum);
		// find max
		OptionalInt optionalMax = Arrays.stream(digit).max();
//		optionalInt.isPresent()
		System.out.println("Max:" + optionalMax.orElse(0));
	}

	private static int[] getOddDigits(int[] a) {
		int[] result = new int[a.length];
		int rindex = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				result[rindex] = a[i];
				rindex++;
			}
		}

		return Arrays.copyOfRange(result, 0, rindex);
	}

	private static void printfs(int[] digits) {
		for (int i : digits) {
			System.out.print(i + " ");
		}
	}

}
