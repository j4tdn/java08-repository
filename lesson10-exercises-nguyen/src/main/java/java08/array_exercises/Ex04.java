package java08.array_exercises;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int[] array = { 1, 4, 2, 6 };
		array = insertArray(array, 2, 9);
		Arrays.stream(array).forEach(digit -> System.out.print(digit + " "));
		array = removeArray(array, 2);
		System.out.println("\n======================");
		Arrays.stream(array).forEach(digit -> System.out.print(digit + " "));
	}

	public static int[] insertArray(int[] arr, int k, int value) {
		int arrIndex = arr.length - 1;
		int tempIndex = arr.length;
		int[] tempArr = new int[tempIndex + 1];
		boolean inserted = false;

		for (int i = tempIndex; i >= 0; i--) {
			if (arrIndex > -1 && arrIndex >= k) {
				tempArr[i] = arr[arrIndex--];
			} else {
				if (!inserted) {
					tempArr[i] = value;
					inserted = true;
				} else {
					tempArr[i] = arr[arrIndex--];
				}
			}
		}
		return tempArr;
	}

	public static int[] removeArray(int[] arr, int k) {

		int[] arrTemp = new int[arr.length-1];
		for(int i = 0;i<arrTemp.length;i++) {
			if(i<k) {
				arrTemp[i] = arr[i];
			}else {
				arrTemp[i] = arr[i+1];
			}
		}
		
		
		return arrTemp;
	}

}
