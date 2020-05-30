package execution;

public class Ex02 {
	public static void main(String[] args) {
		try {
			int result = divide(6, 0);
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Divide by ZERO/ 0");
		}
		System.out.println("Back to normal!!!");
	}

	private static int divide(int a, int b) throws ArithmeticException {
		return a / b;
	}
}
