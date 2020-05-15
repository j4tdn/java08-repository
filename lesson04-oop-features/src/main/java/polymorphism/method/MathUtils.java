package polymorphism.method;

public class MathUtils {
	/**
	 * Overloading:
	 * + belongs to one class
	 * + same name
	 * + diferrent:
	 * 		- number of parameters
	 * 		- data type of parameters
	 * 		- return type
	 */
	
	private MathUtils() {
		
	}
	
	public static int max(int a, int b) {
		return a > b ? a : b;
	}
	
	public static int max(int ...numbers) {
		
		if(numbers.length==0) {
			System.out.println("mảng k có phần tử nào cả sao mà tìm max dc đây!!!!");
			return Integer.MIN_VALUE;
		}
		int max = numbers[0];
		for(int i=1;i<numbers.length;i++) {
			max = max(max,numbers[i]);
		}
		return max;
	}
	
	public static double max(double a, double b) {
		return a > b ? a : b;
	}
}
