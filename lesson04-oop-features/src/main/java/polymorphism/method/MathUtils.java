package polymorphism.method;

public class MathUtils {
	/**
	 * overloading: + cung 1 class + giong ten + khac : .kieu du lieu .tham so
	 * truyen vao .kieu du lieu tra ve
	 */
	private MathUtils() {

	}

	public static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static double max2(double a, double b) {
		return a > b ? a : b;
	}

	public static int max3so(int a, int b, int c) {
		return max(max(a, b), c);
	}

	public static int max(int... numbers) {
		if (numbers.length == 0) {
			System.out.println("IndexOutOfBoundException");
			return Integer.MIN_VALUE;
		}
		int max = numbers[0];
		for (int num : numbers) {
			max = max(max, num);
		}
		return max;
	}

}
