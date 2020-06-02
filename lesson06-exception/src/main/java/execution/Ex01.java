package execution;

import java.util.Scanner;

public class Ex01 {
	// final constan pool, hang so
	private static final Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int a = input();
			System.out.println("a: " + a);
		}
	}

	private static int input() {
		do {
			try {
				System.out.print("Enter number: ");
				return Integer.parseInt(ip.nextLine());
			} catch (NumberFormatException e) {
//				e.printStackTrace();
				e.getMessage();
			}
		} while (true);
	}
}
