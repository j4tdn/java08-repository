package Exercise;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 5 , 6, 7};
		int[] arrayAfterInsert = insert(arr, 4 , 4);
		Arrays.stream(arrayAfterInsert).forEach(number -> System.out.print(number + " "));
		int[] arrayAfterDelete = delete(arr, 1);
		System.out.println();
		Arrays.stream(arrayAfterDelete).forEach(number -> System.out.print(number + " "));
	}
	
	private static int[] insert(int[] arr, int k, int insertedNumber) {
		int[] result = new int[arr.length + 1];
		int index = 0;
		for (int i = 0; i < k; i++) {
			result[index] = arr[i];
			index++;
		}
		result[k - 1] = insertedNumber;
		for (int i = k; i < result.length; i++) {
			result[index] = arr[i - 1];
			index++;
		}
		return result;
	}
	
	private static int[] delete(int[] arr, int k) {
		int[] result = new int[arr.length - 1];
		int index = 0;
		for (int i = 0; i < result.length; i++) {
			if( (k - 1) > i) {
				result[index] = arr[i];
				index++;
			}
			if( i >= (k - 1)) {
				result[index] = arr[i + 1];
				index++;
			}
		}
		return result;
	}
	

}
