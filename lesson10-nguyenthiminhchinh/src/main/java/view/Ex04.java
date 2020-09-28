package view;

import java.util.Arrays;
import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		System.out.println("---Mang---");
		int[] numbers = new int[10];
		for (int i = 0; i < 10; i++) {
			numbers[i] = new Random().nextInt(10);
		}
		Arrays.stream(numbers).forEach(number -> System.out.print(number + " "));

		System.out.println("\n---Them phan tu---");
		int valueI = 1;
		int indexI = 2;
		int[] insertK = insertK(numbers, valueI, indexI);
		Arrays.stream(insertK).forEach(number1 -> System.out.print(number1 + " "));

		System.out.println("\n---Xoa phan tu---");
		int indexD = 2;
		int[] delK = delK(numbers, indexD);
		Arrays.stream(delK).forEach(number1 -> System.out.print(number1 + " "));

	}

	private static int[] delK(int[] numbers, int indexD) {
		int[] results = new int[numbers.length - 1];
		for (int i = 0; i < indexD; i++) {
			results[i] = numbers[i];
		}
		for (int i = indexD; i < results.length; i++) {
			results[i] = numbers[i + 1];
		}
		return results;
	}

	private static int[] insertK(int[] numbers, int value, int index) {
		int[] results = new int[numbers.length + 1];
		for (int i = 0; i < index; i++) {
			results[i] = numbers[i];
		}
		results[index] = value;
		for (int i = index + 1; i < results.length; i++) {
			results[i] = numbers[i - 1];
		}
		return results;
	}
}
