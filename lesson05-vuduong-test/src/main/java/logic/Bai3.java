package logic;

import java.util.GregorianCalendar;

public class Bai3 {
	public static void main(String[] args) {
		System.out.println(isPowerOf(1, 1));
	}

	private static boolean isPowerOf(int a, int b) {
		if (a == 0 || b == 0) {
			return false;
		}
		int grater = a > b ? a : b;
		int lesser = a > b ? b : a;
		int temp = lesser;
		while (true) {
			temp = temp * lesser;
			if (temp == grater) {
				return true;
			}

			if (temp > grater) {
				return false;
			}
		}
	}

}
