package execution;

public class Ex02 {
	public static void main(String[] args) {
		
		int result  = 0;
		try {
			 result = divide(2,0);
		} catch (ArithmeticException e) {
			System.out.println("Divide by Zero/0");
		}
		
		
		
		
		
		System.out.println(result);
	}
	private static int divide(int a, int b) throws ArithmeticException {
		return a/ b;
	}
	
	
}
