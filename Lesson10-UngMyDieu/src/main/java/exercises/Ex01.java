package exercises;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] nums = {1,6,2,7,8,2,8,4,9,8};
		
		// Remove Duplicate element
//		int length = removeDuplicateElement(nums);		
//		print(nums, length);
		
		// Compare average of 5 first elements to 5 last elements
		compareAvg(nums);
		
		// insert sort
//		insertionSort(nums);
//		Arrays.stream(nums).forEach(item -> System.out.print(item + "  "));
		
		// find third largest number
		System.out.println(find3largest(nums));
	}		
	
	public static int removeDuplicateElement(int[] nums) {
		int lengthArr = nums.length; 		
		
		for(int i = 0; i < lengthArr; i++) {
			int last = lengthArr - 1;	
			boolean isDuplicate = false;

			while (last > i) {
				if (nums[i] == nums[last]) {
				 	lengthArr = removeElement(nums, last, lengthArr);
				 	isDuplicate = true;
				}
				last--;
			}
			if (isDuplicate) lengthArr = removeElement(nums, i, lengthArr);
		}
		
		return lengthArr;
	}
	
	public static int removeElement(int[] nums, int index, int length) {
		for (int i = index; i < length - 1; i++)
			nums[i] = nums[i+1];
		
		return length - 1;
	}
	
	public static void compareAvg(int[] nums) {
		System.out.println("Average of 5 first elements: " + Arrays.stream(Arrays.copyOfRange(nums, 0, 5)).sum()*1.0/5 
				 + " - 5 last elements: " + Arrays.stream(Arrays.copyOfRange(nums, 5, 10)).sum()*1.0/5); 
	}
	
	public static void insertionSort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int key = nums[i];
			int j = i -1;
			
			while (j >= 0 && nums[j] > key) {
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1] = key;
		}
	}
	
	public static int find3largest(int[] arr) 
    { 
        Arrays.sort(arr); 
        int n = arr.length; 
        int check = 0, count = 1; 
  
        for (int i = 1; i <= n; i++) { 
  
            if (count < 4) { 
                if (check != arr[n - i]) { 
                    check = arr[n - i]; 
                    count++; 
                } 
            } 
            else
                break; 
        } 
        return check;
    } 
	
	public static void print(int[] nums, int length) {
		for (int i = 0; i < length; i++)
			System.out.print(nums[i] + " ");
	}
}
