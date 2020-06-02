package execution;

import java.util.Scanner;

public class Ex03 {
	private static final Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

	}

	private static int devide() {
		try {
			System.out.println("Enter a : ");
			int a = ip.nextInt();
			System.out.println("Enter b : ");
			int b = ip.nextInt();
			return a / b;

		} catch (NumberFormatException | ArithmeticException e) {
			e.getMessage();
		}
		return 0;
	}
}
