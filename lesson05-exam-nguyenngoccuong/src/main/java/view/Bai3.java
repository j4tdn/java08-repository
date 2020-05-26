package view;

public class Bai3 {
	public static void main(String[] args) {
		int a = 8;
		int b = 2;
		boolean isPowerOf = isPowerOf(a, b);
		System.out.println(isPowerOf);
	}
	public static boolean isPowerOf(int a, int b) {
		if (a < b) {
			a = a + b;
			b = a - b;
			a = a - b;
		}
		int number = b;
		while (b < a) {
			b *= number;
		}
		if (a == b) return true;
		else return false;
	}
}
