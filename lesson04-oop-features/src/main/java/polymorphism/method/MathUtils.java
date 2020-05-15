package polymorphism.method;

public class MathUtils {
	
	private MathUtils() {
		
	}
	/**
	 * Overloading:
	 * + belongs to ONE class
	 * + Same name
	 * + Different:
	 * . Number of parameters(tham so truyen vao)
	 * . Datatype of parameters
	 * . Return type
	 */
	public static int max(int a, int b) {
		return a > b ? a : b;
	}
	public static double max(double a, double b) {
		return a > b ? a : b;
	}
	public static int max(int a, int b, int c) {
		return max(max(a,b),c);
	} 
	// ... cho phep truyen tu 0 den n
	public static int max(int ...numbers) {
		if(numbers.length == 0) {
			System.out.println("ArrayIndexOutOfBoundException");
			return Integer.MIN_VALUE;
		}
		int max = numbers[0];
		for (int num : numbers) {
			max = max(max, num);
			/*if (max < num) {
				max = num;
			}*/
		}
		return max;
	}

}
