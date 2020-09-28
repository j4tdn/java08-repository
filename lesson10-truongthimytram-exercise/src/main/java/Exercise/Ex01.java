package Exercise;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 4, 5, 1, 8, 9, 1, 10};
	    int[] result = removeDuplicate(arr);
		Arrays.stream(result).forEach(element -> System.out.print(element + " "));
		System.out.println();
		compareSumOfHalf(arr);
		insertionSort(arr);
		Arrays.stream(arr).forEach(element -> System.out.print(element + " "));
		System.out.println();
		System.out.println("Third largest number is: " + findLargestNumberByIndex(arr, 3));

	}
	
	private static int[] removeDuplicate(int[] arr) {
		return Arrays.stream(arr).distinct().toArray();
	}
	
	private static void compareSumOfHalf(int[] arr) {
		int first = (arr.length - 1)/2;
		double firstAverage = Arrays.stream(arr).skip(0).average().orElseThrow();
		double lastAverage = Arrays.stream(arr).skip(first).average().orElseThrow();
		if(firstAverage == lastAverage) {
			System.out.println("first half of array is equal to its last half");
		} 
		else if(firstAverage > lastAverage) {
			System.out.println("first half of array is greater than its last half");
		}
		else {
			System.out.println("first half of array is less than its last half");
		}
	}
	
	private static void insertionSort(int[] arr) { 
        for (int i = 1; i < arr.length; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
	}
	
	private static int findLargestNumberByIndex(int[] arr, int index) {
		int[] tmp = removeDuplicate(arr);
		insertionSort(tmp);
		int maxByIndex = Integer.MIN_VALUE;
		for (int i = tmp.length - 1; i >= 1; i--) {
		    if(tmp[i] != tmp[i-1]) {
		    	index--;	
		    }
		    if(index == 0) {
		    	maxByIndex = tmp[i];
		    }
		}
		return maxByIndex;
	}

}
