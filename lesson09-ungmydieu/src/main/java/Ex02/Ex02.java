package Ex02;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		String x1 = "01adkk34566djhja478";
		String x2 = "aa6b546c6e22h";
		String x3 = "aa6b326c6e22h";
		
		System.out.println("n = 1 : ");
		for (Integer i : getLargestNumbers(x1)) {
			System.out.println(i);
		}
		
		System.out.println("\nn = 2 : ");
		for (Integer i : getLargestNumbers(x2, x3)) {
			System.out.println(i);
		}
	}
	
	public static int[] getLargestNumbers(String... ss) {			
		int[] nums = new int[ss.length];
		int count = 0;
		
		for (String s : ss) {
			int max = Integer.MIN_VALUE; 
			
			for (String num : s.split("[a-z]+")) {				
				if (!num.equals("")) {
					int x = Integer.parseInt(num);
					if (max < x) {
						max = x;
					}
				}				
			}
			nums[count] = max;
			count++;
		}
		Arrays.sort(nums);
		
		return nums;
	}
}
