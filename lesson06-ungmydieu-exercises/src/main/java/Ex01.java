import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		do {
			try {
				System.out.print("a = ");
				a = sc.nextInt();
				System.out.print("b = ");
				b = sc.nextInt();
				
				System.out.println("Result: " + firstDegreeEquation(a, b));
				break;
			} catch (ArithmeticException e1) {	
				System.out.println("Error divide by 0");				
			} catch (InputMismatchException e2) {
				System.out.println("Error data type, please enter again! " + e2);
				sc.nextLine();
			}
		} while (true);		
			
	}
		
	public static double firstDegreeEquation(int a, int b) throws ArithmeticException {		
		return ((double) -b)/a;
	}
}
