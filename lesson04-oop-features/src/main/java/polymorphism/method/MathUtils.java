package polymorphism.method;

public class MathUtils {

	// overloading
	// cùng 1 class
	// cùng tên
	// khác:
	//// tên biến truyền vào
	//// kiểu dữ liệu biến truyền vào
	//// kiểu trả về

	private MathUtils() {

	}

	public static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static double max(double a, double b) {
		return a > b ? a : b;
	}

	public static int max(int a, int b, int c) {
		return max(max(a, b), c);
	}

	public static int max(int... numbers) {
		if (numbers.length == 0) {
			System.out.println("ArrayIndexOutOfBoundException");
			return Integer.MIN_VALUE;
		}
		int max = numbers[0];
		for (int number : numbers) {
			max = max(max, number);
		}
		return max;
	}
}
