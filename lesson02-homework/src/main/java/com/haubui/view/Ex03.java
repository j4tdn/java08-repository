package com.haubui.view;

public class Ex03 {
	private static int revert(int number) {
		String result = "";
		while (number > 0) {
			result += number % 10;
			number /= 10;
		}

		try {
			return Integer.parseInt(result);
		} catch (NumberFormatException e) {
			return -1;
		}
	}

	private static boolean isSymmetric(int number) {
		return number == revert(number);
	}

	public static void main(String[] args) {
		
		System.out.println(isSymmetric(1333199999));
		//revert number = -1; false
		
		System.out.println(isSymmetric(13331));
		//revert number = 13331; true
	}
}
