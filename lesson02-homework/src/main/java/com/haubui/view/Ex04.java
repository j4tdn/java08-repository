package com.haubui.view;

public class Ex04 {
	public static void main(String[] args) {
		int numbers1[] = { 2, 4, 6, 8, 10 };
		System.out.println(getSecondLargestOddNumber(numbers1));
		// return -1

		int numbers2[] = { 2, 4, 7, 10, 12 };
		System.out.println(getSecondLargestOddNumber(numbers2));
		// return -1

		int numbers3[] = { 2, 6, 9, 9, 7, 0, 0 };
		System.out.println(getSecondLargestOddNumber(numbers3));
		// return 7
	}

	private static int getSecondLargestOddNumber(int[] numbers) {

		int max = 0;
		int secondMax = 0;
		int countOfOddNumber = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {

				countOfOddNumber++;

				if (numbers[i] > max) {
					secondMax = max;
					max = numbers[i];
				} else if (numbers[i] > secondMax && numbers[i] < max) {
					secondMax = numbers[i];
				}
			}
		}

		if (countOfOddNumber < 2) {
			return -1; // no result
		}

		return secondMax;
	}
}
