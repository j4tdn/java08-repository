package ex03;

public class Ex03 {
	public static boolean isPowerOf(int a, int b) {

		for (int i = 0; i < a; i++) {
			if (Math.pow(b, i) == a) {
				return true;
			}
		}

		return false;
	}
}
