package polymorphism.method;

public class MathUtils {
	
	/**
	 * Overloading 
	 * + Thuoc cung class (Belongs to 0NE class)
	 * + Same name
	 * + Different: 
	 * 		- Number of parameter (tham so truyen vao)
	 * 		- Date type of parameter (kieu du lieu truyen vao)
	 * 		- Return type (kieu du lieu tra ve)
	 */
	private MathUtils() {

	}

	public static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static int max(int a, int b, int c) {
		return max(max(a, b), c);
	}

	public static double max(double a, double b) {
		return a > b ? a : b;
	}
	public static int max(int... numbers) {
		if(numbers.length == 0) {
			System.out.println("ArrayIndexOutOfBoundException");
			return Integer.MIN_VALUE;
		}
		int max = numbers[0];
		for (int num : numbers) {
			max = max(max, num);
		}
		return max;
	}
}
