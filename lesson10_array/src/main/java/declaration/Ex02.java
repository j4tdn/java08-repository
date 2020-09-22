package declaration;

import java.util.Arrays;
import java.util.OptionalInt;

public class Ex02 {
	public static void main(String[] args) {
		//in ra cac phan tu le trong mang
		int[] digits = {1,7,2,9,8,12};
		int[] odDigits = getOdDigits(digits);
		printf(odDigits);
		System.out.println("=======================");
		int[] odDigits2nd = Arrays.stream(digits).filter(digit -> digit % 2 != 0).toArray();
		printf(odDigits2nd);
		
		int sum = Arrays.stream(digits).filter(digit -> digit % 2 == 0).sum();
		System.out.println("=======================");
		System.out.println("sum: "+sum);
		
		OptionalInt optionalMax = Arrays.stream(digits).max();
		System.out.println(optionalMax.orElse(0));
	}
	
	private static void printf(int[] digits) {
		for(int digit: digits) {
			System.out.println(digit);
		}
	}
	
	public static int[] getOdDigits(int[] digits) {
		int[] result = new int[digits.length];
		int index = 0;
		for(int digit:digits) {
			if(digit % 2 != 0) {
				result[index++] =digit; 
			}
		}
		
		return Arrays.copyOfRange(result, 0, index);
	}

}
