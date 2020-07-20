package ex01;

import java.util.Scanner;

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		do {
			try {
				System.out.println("Enter the number A : ");
				int numberA = Integer.parseInt(ip.nextLine());
				
				System.out.println("Enter the number B: ");
				int numberB = Integer.parseInt(ip.nextLine());
				double result = - (double) numberB / (double) numberA;
				
				System.out.println("Result: "  + result);
				System.exit(0);
			} catch (NumberFormatException | ArithmeticException e) {
				System.out.println("Ban da nhap sai roi !  ");
			}
		} while (true);
	}

	private double equaltion(int a, int b) {
		double result = 0;
		do {
			try {
				System.out.println("Enter the number A : ");
				int numberA = Integer.parseInt(ip.nextLine());
				System.out.println("Enter the number B: ");
				int numberB = Integer.parseInt(ip.nextLine());
				result = -(double) numberB / (double) numberA;
				break;

			} catch (NumberFormatException | ArithmeticException e) {
				System.out.println("Ban da nhap sai roi !  ");
			}

		} while (true);
		return result;
	}
}
