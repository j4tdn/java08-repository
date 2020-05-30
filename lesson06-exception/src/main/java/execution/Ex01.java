package execution;

import java.util.Scanner;

public class Ex01 {
	private static final Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int a = input();
			System.out.println("a: " + a);
		}

	}

	private static int input() {
		// int number = 0;
		do {
			try {
				System.out.println("Enter number: ");
				return Integer.parseInt(ip.nextLine());
				// break;
			} catch (NumberFormatException e) {
				// System.out.println("Please enter the valid number !!!");
				// e.printStackTrace();
				System.out.println(e.getMessage());
			}

		} while (true);
		// return number;
	}
}
