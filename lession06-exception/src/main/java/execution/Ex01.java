package execution;

import java.util.Scanner;

public class Ex01 {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int a = imput();
			System.out.println("a = " + a);
		}
	}

	private static int imput() {
		do {
			try {
				System.out.println("enter a number : ");
				return Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				// System.out.println("nhap vao 1 so : ");
				e.printStackTrace();
			}
		} while (true);
	}
}
