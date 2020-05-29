package execution;

import java.util.Scanner;

public class Ex01 {

	private static final Scanner ip = new Scanner(System.in);

	// final luu tru o constant pool
	public static void main(String[] args) {
		int a = input();
		System.out.println("a: " + a);
	}

	private static int input() {
		int number = 0;
		while (true) {
			System.out.println("Enter a number: ");
			try {
				number = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				// e.printStackTrace();
				System.err.println("ERROR: " + e.getMessage());
			}
		}
		return number;
	}
}
