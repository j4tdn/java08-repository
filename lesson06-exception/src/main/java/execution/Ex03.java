package execution;

import java.util.Calendar;
import java.util.Scanner;

public class Ex03 {
	
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		divide();
	}
	
	private static int divide() {
		
		try {

			Calendar c = Calendar.getInstance();
			System.out.println(c.get(Calendar.MONTH));


			System.out.println("Enter a : ");
			
			int a = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter b : ");
			
			int b = Integer.parseInt(sc.nextLine());
			
			return a/b ;
			
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		return 0;
		
	}
}
