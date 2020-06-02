package execution;

import java.util.Scanner;

public class Ex03 {

	private static final Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		divide();
	}

	private static int divide() {
		try {
			System.out.print("Enter a: ");
			int a = Integer.parseInt(ip.nextLine());
			System.out.print("Enter b: ");
			int b = Integer.parseInt(ip.nextLine());
			return a / b;
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}
}
