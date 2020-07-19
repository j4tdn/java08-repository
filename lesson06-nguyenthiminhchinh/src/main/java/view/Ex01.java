package view;

import java.util.Scanner;

public class Ex01 {
	private static final Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			float a = input();
			float b = input();
			System.out.println("a: " + a);
			System.out.println("b: " + b);
			try {
				if (a == 0) {
					throw new ArithmeticException();
				}
				float x = -b / a;
				System.out.println("x = " + x);
			} catch (ArithmeticException e) {
				System.out.println("Divide by ZERO/ 0");
			}

		}

	}

	private static int input() {
		do {
			try {
				System.out.println("Enter number: ");
				return Integer.parseInt(ip.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Please enter the valid number !!!");
			}

		} while (true);
	}
}
