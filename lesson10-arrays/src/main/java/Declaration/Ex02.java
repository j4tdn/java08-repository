package Declaration;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.IntPredicate;

public class Ex02 {
	public static void main(String[] args) {
		//  tìm ra các phần tử lẻ trong mảng 
		int[] digits = {1,2,11,6,7,9,12};
		
		int[] arr1 = getOddDigits(digits);
		
		printf(arr1);
		
		
		// 2nd way  : Stream 
		
		printf(Arrays.stream(digits).filter( digit -> digit %2 !=0 ).toArray());
		
		// cal sum 
		System.out.println(Arrays.stream(digits).filter(digit -> digit %2 == 0 ).sum());
		
		// find max, min 
		
		OptionalInt optionalMax = Arrays.stream(digits).max();
		
		System.out.println(optionalMax.orElse(0));
		
	}
	
	private static void printf(int[] arrs) {
		for(int arr:arrs) {
			System.out.println(arr);
		}
	}
	
	private static int[] getOddDigits(int[] digits) {
		
		int[] result = new int[digits.length];
		
		int rindex = 0 ;
		
		for(int digit:digits) {
			if(digit %2 !=0) {
				result[rindex++] = digit ;
			}
		}
		
		return Arrays.copyOfRange(result, 0,rindex);
			
	}
	
	
	
}
