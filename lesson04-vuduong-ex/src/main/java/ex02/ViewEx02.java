package ex02;

import java.util.Arrays;

public class ViewEx02 {
	public static void main(String[] args) {
		int[] array = { 5, 23, 35, 2, 7, 14, 35, 10, 70 };

		convertArray(array);
	}

	private static int[] convertArray(int[] array) {
		int[] result = new int[array.length];
		int left = 0;
		int right = array.length - 1;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 5 != 0 && array[i] % 7 == 0) {
				result[left] = array[i];
				left++;
			}

			if (array[i] % 5 == 0 && array[i] % 7 != 0) {
				result[right] = array[i];
				right--;
			}

		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 35 == 0 || (array[i] % 5 != 0 && array[i] % 7 != 0)) {
				result[left] = array[i];
				left++;
			}
		}

		Arrays.stream(result).forEach(System.out::println);

		return result;
	}

}
