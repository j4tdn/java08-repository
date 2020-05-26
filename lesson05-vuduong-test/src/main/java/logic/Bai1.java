package logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai1 {
	public static void main(String[] args) {
		int[] array = { 3, 15, 21, 0, 15, 17, 21 };
		getUniqueNumbers(array);
	}

	private static int[] getUniqueNumbers(int[] array) {
		List<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		Arrays.stream(array).forEach(System.out::println);
		System.out.println("=====================");

		result.add(array[0]);
		for (int i = 1; i < array.length - 1; i++) {
			if (array[i] == array[i + 1] || array[i] == array[i - 1]) {
				i++;
			} else {
				result.add(array[i]);
			}
		}

		int[] resultArray = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			resultArray[i] = result.get(i);
		}

		Arrays.stream(resultArray).forEach(System.out::println);
		return resultArray;
	}

}
