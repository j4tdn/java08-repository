package polymorphism.method;

public class MathUtils {
	/**
	 * Overloading: + Belong to ONE class + Same name + Different : -Number of
	 * parameter -Data type of parameter -Return type
	 */

	private MathUtils() {
	}

	// khong cho tao doi tuong va goi
	// khong anh huong den doi tuong khi tao nhieu doi tuong
	public static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static double max(double a, double b) {
		return a > b ? a : b;
	}

	public static int max(int a, int b, int c) {
		return max(max(a, b), c);
	}

	public static int max(int... number) {
		if(number.length == 0) {
			System.out.println("ArrayIndexOutOfBoundExeption");
			 return Integer.MIN_VALUE;
		}
		int max = Integer.MIN_VALUE;
		for (int num : number) {
			if (max < num) {
				max = max(max,num);
			}
		}
		return max;
	}
}
