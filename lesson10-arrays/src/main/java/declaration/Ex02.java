package declaration;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.IntPredicate;

public class Ex02 {
	public static void main(String[] args) {
		// Tim cac ptu le trong mang
		int[] digits = {};
		int[] oddDigits = getOddDigits(digits);
		
		printf(oddDigits);
		
		System.out.println("\n===============================");
		
		//c2: 2nd way: stream
		int[] addDigits2Nd = Arrays.stream(digits)
		.filter(digit -> digit % 2 != 0)
		.toArray();
		printf(addDigits2Nd);
		
		//c2: 2nd way: stream
//		Arrays.stream(digits).filter((int value) -> {
//			return value % 2 != 0;
//		});
		
		//calculate sum
		int sum = Arrays.stream(digits)
		.filter(digit -> digit % 2 == 0)
		.sum(); //max
		
		System.out.println("\nsum: " + sum);
		
		//find max
		OptionalInt optionalMax = Arrays.stream(digits).max();
		System.out.println("max: " + optionalMax.orElse(30)); //neu mang rong thi tra ve mac dinh max = 30
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
