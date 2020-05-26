package bean;

public class Bai3 {
	public static void main(String[] args) {
    System.out.println(isPowerOf(9, 2));
	}
	private static boolean isPowerOf(int a, int b) {
		for (int i = 0; i < a; i++) {
			if (a == Math.pow(b, i))
				return true;
		}
		return false;
	}

}
