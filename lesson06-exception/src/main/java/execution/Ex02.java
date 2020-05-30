package execution;

public class Ex02 {
	public static void main(String[] args) {
		try {
			int result = devide(6, 0);
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero");
		}
		System.out.println("Back to normal");
	}

	private static int devide(int a, int b) throws ArithmeticException { //bat buoc ko phu thuoc track hay untrack
		return a / b;
	}
}
