package ex02;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {

		Arrays.stream(getLargestNumbers("ab123sjdf45dfg", "sudf09856sdf234", "sdf024", "")).forEach(System.out::println);
	}

	private static int[] getLargestNumbers(String... inputs) {
		int[] largestNumbers = new int[inputs.length];
		for (int i = 0; i < inputs.length; i++) {
			String[] numbers = inputs[i].split("[a-z]+");

			largestNumbers[i] = getMaxNumberFromArrayString(numbers);
		}

		Arrays.sort(largestNumbers);
		return largestNumbers;

	}

	private static int getMaxNumberFromArrayString(String[] numbers) {
		int max = 0;
		for (String number : numbers) {
			try {
				int currentNum = Integer.parseInt(number);
				if (currentNum > max) {
					max = currentNum;
				}
			} catch (Exception e) {
				continue;
			}
		}

		return max;

	}
}
