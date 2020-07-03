package ex02;

import java.util.Arrays;

public class Ex02 {

	public static String[] getLargestNumbers(String... inputs) {
		String[] result = new String[inputs.length];
		int index = 0;

		for (String input : inputs) {
			int max = 0;
			String temp[] = input.split("[a-z]+");

			for (int i = 0; i < temp.length; i++) {
				if (isValidNumber(temp[i])) {
					if (Integer.parseInt(temp[i]) > max) {
						max = Integer.parseInt(temp[i]);
					}
				}
			}
			
			result[index++] = max + "";

		}
		Arrays.sort(result);
		return result;
	}

	private static boolean isValidNumber(String input) {
		if (input.length() < 2 || (input.length() == 2 && input.startsWith("0"))) {
			return false;
		}

		try {
			Integer.parseInt(input);
		} catch (NumberFormatException e) {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(getLargestNumbers("aa6b546c6e22h", "aa6b326c6e22h")));
	}
}
