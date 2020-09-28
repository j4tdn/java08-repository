package Ex04;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		int[] arr = {1,2,5,6} ;
		int[]  arr1 = insertAtK(arr, 2, 69);
		printArr(arr1);
		
		
		int[] arr2 = removeAtK(arr, 2);
		
		printArr(arr2);
	}
	
	private static void printArr(int[] arr) {
		Arrays.stream(arr).forEach(el -> System.out.println(el));
	}
	
	private static int[] insertAtK(int[] arr, int k , int el) {
		int[] newArr = new int[arr.length+1];
		
		for(int i = 0 ; i<k ; i++) {
			newArr[i] = arr[i];
		}
		
		newArr[k] = el ;
		
		for(int i = k+1; i<newArr.length ; i++) {
			newArr[i] = arr[i-1];
		}
		
		return newArr ;
		
	}
	
	private static int[] removeAtK(int[] arr, int k ) {
		int[] newArr = new int[arr.length-1];
		
		for(int i = 0 ; i<k ; i++) {
			newArr[i] = arr[i];
		}
		
		for(int i = k ; i < newArr.length; i++) {
			newArr[i] = arr[i+1];
		}
		
		return newArr ;
	}
	
}