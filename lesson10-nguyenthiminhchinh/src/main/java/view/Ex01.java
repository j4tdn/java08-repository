package view;

import java.util.Arrays;
import java.util.Random;

public class Ex01 {
	static Random rd = new Random();

	public static void main(String[] args) {
		System.out.println("---Mang---");
		int[] numbers = new int[10];
		for (int i = 0; i < 10; i++) {
			numbers[i] = new Random().nextInt(10);
		}
		Arrays.stream(numbers).forEach(number -> System.out.print(number + " "));

		System.out.println("\n---Mang xoa cac phan tu trung nhau---");
		int[] numbers1 = getUniqueNumbers(numbers);
		Arrays.stream(numbers1).forEach(number1 -> System.out.print(number1 + " "));

		System.out.println("\n---So sanh---");
		compare(numbers);

		System.out.println("\n---insertion sort---");
		int[] inserSort = insertionSort(numbers);
		Arrays.stream(inserSort).forEach(numberSort -> System.out.print(numberSort + " "));

		System.out.println("\n---third max---");
		thirdMax(numbers);

	}

	private static void thirdMax(int[] numbers) {
		int n = numbers.length;
		if (n < 3) {
			System.out.println(" Invalid Input");
		}

		int first = numbers[0], second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

		for (int i = 1; i < n; i++) {
			if (numbers[i] > first) {
				third = second;
				second = first;
				first = numbers[i];
			} else if (numbers[i] > second) {
				third = second;
				second = numbers[i];
			} else if (numbers[i] > third) {
				third = numbers[i];
			}
		}
		System.out.println(third);

	}

	private static int[] insertionSort(int[] numbers) {
		int n = numbers.length;
		for (int i = 1; i < n; ++i) {
			int key = numbers[i];
			int j = i - 1;
			while (j >= 0 && numbers[j] > key) {
				numbers[j + 1] = numbers[j];
				j = j - 1;
			}
			numbers[j + 1] = key;
		}
		return numbers;
	}

	private static void compare(int[] numbers) {
		if (ave(Arrays.copyOfRange(numbers, 0, 4)) == ave(Arrays.copyOfRange(numbers, 5, 10))) {
			System.out.print("bang");
		} else if (ave(Arrays.copyOfRange(numbers, 0, 4)) > ave(Arrays.copyOfRange(numbers, 5, 10))) {
			System.out.print("lon hon");
		} else {
			System.out.print("nho hon");
		}

	}

	private static float ave(int[] numbers) {
		float sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum / numbers.length;
	}

	private static int[] getUniqueNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int index = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (!isUniqueNumber(numbers, numbers[i], i)) {
				result[index++] = numbers[i];
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}

	private static boolean isUniqueNumber(int[] numbers, int number, int index) {
		for (int i = 0; i < numbers.length; i++) {
			if (i != index && number == numbers[i]) {
				return true;
			}
		}
		return false;
	}
}
