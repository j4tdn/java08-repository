package logic;

public class Bai4 {
	public static void main(String[] args) {
		int[] array = { 5, 20, 30 };
		System.out.println(getLeastCommonMultiple(array));
	}

	private static int getLeastCommonMultiple(int[] array) {
		int temp = 1;
		for (int i = 0; i < array.length; i++) {
			temp = getLeastCommon(array[i], temp);
		}
		return temp;
	}

	private static int getGreatCommonDivisor(int a, int b) {
		while (a != b) {
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}

		return a;
	}

	private static int getLeastCommon(int a, int b) {
		return a * b / getGreatCommonDivisor(a, b);
	}
}
