package execution;

public class Ex02 {
	public static void main(String[] args) {
		try {
			System.out.println("result : " + divide(6, 0));
		} catch (ArithmeticException e) {
			System.err.println("ERROR: " + e.getMessage());
		}
	}

	private static int divide(int a, int b) throws ArithmeticException {
		return a / b;
	}
}
