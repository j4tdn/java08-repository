package com.haubui.view;

public class Ex02 {
	private static long factorial(int number) {
		if (number <= 2) {
			return number;
		}
		return number * factorial(number - 1);
	}

	public static void main(String[] args) {
		System.out.println("S = 4! +7! + 12! + 18! = " + factorial(4) + factorial(7) + factorial(12) + factorial(18));
	}
}
