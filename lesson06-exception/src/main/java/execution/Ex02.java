package execution;

public class Ex02 {
	public static void main(String[] args) {
		try {
			System.out.println(devide(6, 0));
		} catch (Exception e) {
			System.out.println("/ by zero");
		}
		System.out.println("Back normal");
	}

	public static int devide(int a, int b) throws ArithmeticException {
		return a / b;
	}
}
