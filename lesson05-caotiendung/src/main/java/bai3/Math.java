package bai3;

public class Math {
	public static void main(String[] args) {
		System.out.println(isPowerOf(8, 2));
	}

	public static boolean isPowerOf(int a, int b) {
		if (a == 1) {
			return true;
		} else {
			while (a > 0) {
				a = a / b;
			}
			if (a != b) {
				return false;
			}
			return true;

		}
	}

}