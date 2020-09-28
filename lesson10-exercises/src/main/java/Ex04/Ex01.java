package Ex04;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] arrayNumbers = { 1, 2, 3, 4, 3, 1 };
		int[] newAdd = add(arrayNumbers, 4, 0);
		int[] newRemove = remove(newAdd, 4);
		Arrays.stream(newAdd).forEach(number -> System.out.print(number + " "));
		System.out.println("");
		Arrays.stream(newRemove).forEach(number -> System.out.print(number + " "));
	}

	public static int[] add(int[] array, int k, int value) {
		int[] newArray = new int[array.length + 1];
		for (int i = 0; i < newArray.length; i++) {
			if (i == k) {
				newArray[i] = value;
			} else if (i > k) {
				newArray[i ] = array[i - 1];
			} else {
				newArray[i] = array[i];
			}
		}
		return newArray;
	}
	
	public static int[] remove(int[] array, int k) {
		int[] newArray = new int[array.length - 1];
		for (int i = 0; i < newArray.length; i++) {
			 if (i >= k) {
				newArray[i] = array[i + 1];
			} else {
				newArray[i] = array[i];
			}
		}
		return newArray;
	}
}
