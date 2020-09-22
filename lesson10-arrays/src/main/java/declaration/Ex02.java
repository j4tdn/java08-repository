package declaration;


import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.IntPredicate;

public class Ex02 {
	public static void main(String[] args) {
		// tim cac phan tu le trong mang
		int[] digits = { 1, 7, 2, 9, 11, 12 };
		int[] odd=getoddDigits(digits);
		print(odd);
		
		System.out.println("==============================");
		
		//cach 2 stream 
		int[]odd1=Arrays.stream(digits).filter(digit-> digit %2!=0)
		.toArray();
		
		print(odd1);
		
		//tinh tong cac phan tu chan
		
		int sum=Arrays.stream(digits).filter(digit -> digit%2 == 0)
		.sum();
		
		System.out.println("========================");
		System.out.println("Sum: "+sum);
		
		System.out.println("=========================");
		
		//tim max
		OptionalInt max=Arrays.stream(digits).max();		
		System.out.println("max: "+max.orElse(0));
		
		
	}

	private static void print(int[] digits) {
		for (int i : digits) {
			System.out.println(i + " ");
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