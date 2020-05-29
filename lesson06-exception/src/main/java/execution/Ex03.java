package execution;

import java.util.Scanner;

public class Ex03 {
	private static final Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("result : " + divide());
	}

	private static int divide() {
		while (true) {
			try {
				System.out.println("Enter a: ");
				int a = Integer.parseInt(ip.nextLine());
				System.out.println("Enter b: ");
				int b = Integer.parseInt(ip.nextLine());
				return a / b;
			} catch (NumberFormatException | ArithmeticException e) {
				// e.printStackTrace();
				System.err.println("ERROR: " + e.getMessage());
			}
		}
	}

}
