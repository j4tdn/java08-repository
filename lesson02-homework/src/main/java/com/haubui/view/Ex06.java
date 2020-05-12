package com.haubui.view;

public class Ex06 {
	public static void main(String[] args) {
		System.out.println(get200thPrimeNumber());
	}

	private static boolean isPrime(int number) {

		if (number <= 1) {
			return false;
		}

		for (int i = 2; i < Math.sqrt(number); i++)
			if (number % i == 0) {
				return false;
			}

		return true;
	}

	private static int get200thPrimeNumber() {
		int result = 1;
		int count = 0;
		while (count < 200) {
			result++;
			if (isPrime(result)) {
				count++;
			}
		}
		return result;
	}
}
