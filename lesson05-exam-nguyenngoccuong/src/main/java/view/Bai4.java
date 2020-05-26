package view;

public class Bai4 {
	public static void main(String[] args) {
		int[] array = { 8, 4, 6, 3, 5, 9, 7, 1 };
		int leastCommonMultiple = getLeastCommonMultiple(array);
		System.out.println(leastCommonMultiple);
	}

	public static int getLeastCommonMultiple(int[] array) {
		int lcm = lcm(array[0], array[1]);
		for (int i = 0; i < array.length; i++) {
			lcm = lcm(lcm, array[i]);
		}
		return lcm;
	}

	static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}
}
