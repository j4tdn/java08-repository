package polymorphism.method;

public class MathUtils {
	private MathUtils() {
		/**
		 * overloading : + cùng class + cùng tên + khác kiểu dữ liệu hoặc tham số truyền
		 * vào || trả về
		 * 
		 */
	}

	public static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static double max(double a, double b) {
		return a > b ? a : b;
	}

	public static int max(int... numbers) {
		if (numbers.length == 0) {
			System.out.println("ArrayIndexOutBoundException");
			return Integer.MIN_VALUE;
		}
		int max = numbers[0];
		for (int num : numbers) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}

	public static int max(int a, int b, int c) {
		return a > b ? a : b;
	}
}
