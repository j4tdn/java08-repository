package View;

public class Bai3 {
	public static void main(String[] args) {
		int a = 20;
		int b = 4;
		System.out.println("(" + a+","+b+")"+ isPowerOf(a, b));
	}

	public static boolean isPowerOf(int a, int b) {
		int kq = 1;
		int count = 0;
		do {
			count++;
			kq *= b;
			if (kq == a) {
				return true;
			} else {
				continue;
			}

		} while (kq <= a);
		return false;

	}
}
