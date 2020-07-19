package view;

import java.util.Scanner;

import bean.EmailException;

public class Ex03 {
	private static final Scanner ip = new Scanner(System.in);
	private static final String EMAIL_REGEX = ("\\w+@\\w+[.]\\w+([.]\\w+)?");

	public static void main(String[] args) {
		String email = input();
		System.out.println("email: " + email);
	}

	private static boolean checkEmail(String email) throws EmailException {
		Boolean b = email.matches(EMAIL_REGEX);
		if (b == false) {
			throw new EmailException("Email is invalid!!!");
		}
		return true;
	}

	private static String input() {
		do {
			try {
				System.out.println("Enter email: ");
				String email = ip.nextLine();
				return "" + checkEmail(email);
			} catch (EmailException e) {
				System.out.println(e.getMessage());
			}

		} while (true);
	}
}
