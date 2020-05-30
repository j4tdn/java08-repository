package execution;

import java.util.Scanner;

public class Ex01 { // constance boob
	private static final Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int a = input();
			System.out.println("a :" + a);
		}

	}

	private static int input() {
		do {
			try {
				System.out.println("enter a number:");
				return Integer.parseInt(ip.nextLine());

			} catch (NumberFormatException e) {
				//e.printStackTrace();// theo doi tung dong code , loi toi dau in ra toi do luon, in loi ra nhung van
									// chay tiep duoc, ro rang hon, nen dung

				// System.out.println("please enter a vaild number!!!!");
				System.out.println(e.getMessage());
			}

		} while (true);

	}
}
