package execution;

import java.util.Scanner;

/*
 * 
 */

public class Ex01 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			int a = inputNumber();
			System.out.println("a:\t" + a);
		}

	}

	private static int inputNumber() {
		int number = 0;
		do {
			try {
				System.out.println("Enter number");
				return number = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException ex) {
				//System.out.println("please enter a valid number");
				ex.printStackTrace();
			}
		} while (true);
	}
}
