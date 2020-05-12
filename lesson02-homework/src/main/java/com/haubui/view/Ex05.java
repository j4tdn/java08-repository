package com.haubui.view;

public class Ex05 {
	public static void main(String[] args) {
		System.out.println(convertToBinary(12));
	}

	private static String convertToBinary(int number) {
		String result = "";
		while (number > 0) {
			result = (number % 2 == 0 ? "0" : "1") + result;
			number /= 2;
		}

		return result;
	}
}
