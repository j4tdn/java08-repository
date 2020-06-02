package execution;

public class Ex02 {
	public static void main(String[] args) {
		try {
			System.out.println(divide(5, 0));

		} catch (ArithmeticException e) {
			System.out.println("Divide by zero /0");
		}

	}

	private static int divide(int a, int b) throws ArithmeticException {
		return a / b;
	}
}