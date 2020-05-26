package bai03;

public class Ex01 {
	public static void main(String[] args) {
		int a = 2;
		int b = 8;
		System.out.println(isPowerOf(a, b));
	}

	public static boolean isPowerOf(int a, int b) {
		int c = a;
		for (int i = 0; i < b / 2; i++) {
			c = c * a;
			if (c == b) {
				return true;
			} else {
				continue;
			}
		}
		return false;
	}
}
