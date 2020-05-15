package polymorphism.method;

public class MathUtils {
	
	/*
	 * Overloading:
	 * + Belongs to ONE class
	 * + Same name
	 * + Different:
	 * 		. Number of parameters
	 * 		. Data type of parameters
	 * 		. Return type
	 */
	private MathUtils() {}
	
	public static int max(int a, int b) {
		return a > b ? a : b;
	}
	
	public static int max(int a, int b, int c) {
		return max(max(a, b), c);
	}
	
	public static int max(int ...numbers) {
		if (numbers.length == 0) {
			System.out.println("ArrayIndexOutOfBoundException");
			return Integer.MIN_VALUE;
		}			
		
		int max = numbers[0];
		for (int num : numbers) 
			max = max(max, num);
		return max;
	}
	
	public static double max(double a, double b) {
		return a > b ? a : b;
	}
}
