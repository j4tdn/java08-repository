package exercises;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 5, 6, 7, 8, 9};
		
		nums = insert(nums, 4, 1);
		System.out.println("\nArray with " + Arrays.toString(nums)); 		
		
		nums = delete(nums, 0);
		System.out.println("\nArray with " + Arrays.toString(nums));
	}
	
	public static int[] insert(int[] nums, int num, int index) {
		if (index > nums.length - 1 || index < 0) return nums;
		
		int[] temp = new int[nums.length + 1];
		
		for (int i = 0; i < index; i++) 
			temp[i] = nums[i];
		temp[index] = num; 
		for (int i = index; i < nums.length; i++) 
			temp[i + 1] = nums[i];
		
		return temp;
	}
	
	public static int[] delete(int[] nums, int index) {
		if (index > nums.length - 1 || index < 0) return nums;
			
		int[] temp = new int[nums.length - 1];
		
		for (int i = 0; i < index; i++) 
			temp[i] = nums[i];
		for (int i = index + 1; i < nums.length; i++) 
			temp[i - 1] = nums[i];
		return temp;
	}
}
