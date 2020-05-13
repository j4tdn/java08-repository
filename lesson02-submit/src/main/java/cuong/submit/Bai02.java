package cuong.submit;

public class Bai02 {

	public static void main(String[] args) {
		long sum = factorial(4) + factorial(7) + factorial(12) + factorial(18);
		System.out.println("Result: " + sum);
	}

	public static long factorial(int n) {
		long result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}
