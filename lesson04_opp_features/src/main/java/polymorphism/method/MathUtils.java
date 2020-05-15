package polymorphism.method;

/*
 * Overloading: la cung mot class, cung ten phuong thuc, 
 * Belong to ONE class
 * +Same name, 
 * +Different:
 * 	 [] number parameter;
 *   [] data type of parameter;
 *   [] return type;
 */
public class MathUtils {
	private MathUtils() {
		// TODO Auto-generated constructor stub
	}

	public static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static int max(int a, int b, int c) {
		return max(max(a, b), c);
	}

	public static int max(int... numbers) {
		if (numbers.length == 0) {
			System.out.println("IndexOUtOfBoundException");
			return Integer.MIN_VALUE;
		}
		int max = Integer.MIN_VALUE;
		for (int num : numbers) {
			max = max(max, num);
		}
		return max;
	}

	public static double max(double a, double b) {
		return a > b ? a : b;
	}

}
