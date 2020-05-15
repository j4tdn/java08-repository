package polymorphism.method;

public class MathUtils {
	/**
	 * Overloading:
	 * + Belong to one class
	 * + Same name
	 * + Different:
	 * 	. Number of params
	 *  . Data type of params
	 *  . Return type
	 */
	private MathUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static int max(int a, int b) {
		return a > b ? a : b;
	}
	
	public static int max(int ...numbers) {
		if(numbers.length == 0) {
			System.out.println("OutOfIndexBoundArray");
			return Integer.MIN_VALUE;
		}
		int max = Integer.MIN_VALUE;
		for(int num:numbers) {
			max = max(max, num);
		}
		return max;
	}
	
	public static double max(double a, double b) {
		return a > b ? a : b;
	}
	
	
}
