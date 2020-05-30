package execution;

public class Ex02 {
	public static void main(String[] args) {
		try {
			int result = divide(6,0);
			System.out.println("result: " + result);
		} catch (Exception e) {
			System.out.println("Divide by zero /0");
		}
		
	}
	
	private static int divide(int a, int b) throws ArithmeticException {
		
		return a/ b;
	}
}
