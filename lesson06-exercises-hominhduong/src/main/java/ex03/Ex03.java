package ex03;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println(inputEmail());
	}

	public static String inputEmail() {
		Scanner sc = new Scanner(System.in);
		String email = "";
		String EMAIL_PATTERN = "[\\w&&[^0-9]][\\w.]{8,30}[@][a-zA-Z]{3,8}[.][a-z]{3,8}[.]?[a-z]*[a-z]$";
		boolean check = false;
		do {
			System.out.println("Enter your email");
			email = sc.nextLine();
			System.out.println("the name which you've entered " + email + " " + Pattern.matches(EMAIL_PATTERN, email));
			check = Pattern.matches(EMAIL_PATTERN, email);
		} while (!check);
		return email;
	}
}
