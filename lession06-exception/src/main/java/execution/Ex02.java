package execution;

public class Ex02 {
	public static void main(String[] args) {
		try {
			int result = divide(6, 0);
			System.out.println("result : " + result);
		} catch (ArithmeticException e) {
			System.out.println("divide by zero");
		}
	}

	private static int divide(int a, int b) throws ArithmeticException {
		return a / b;
	}
}
