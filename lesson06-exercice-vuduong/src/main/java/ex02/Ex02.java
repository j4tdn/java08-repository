package ex02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex02 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			try {
				Student student = inputStudent();
				break;
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
				System.out.println("Enter again: ");
			}
		}
	}

	private static Student inputStudent() {
		String specialCharacter = "[!@#$%^&*]";
		char[] specialChars = specialCharacter.toCharArray();

		// Id
		System.out.println("Enter Id: ");
		String id = ip.nextLine();
		if (id.length() != 8) {
			throw new RuntimeException("Id must have 8 characters");
		}
		if (!id.startsWith("bkit-")) {
			throw new RuntimeException("id must start with bkit-");
		}
		for (int i = 5; i < 8; i++) {
			if (!Character.isDigit(id.charAt(i))) {
				throw new RuntimeException("Enter a wrong Id !");
			}
		}

		// Name
		System.out.println("Enter name: ");
		String name = ip.nextLine();

		if (name.length() < 6) {
			throw new RuntimeException("Name is too short ! ");
		}

		for (int i = 0; i < name.length(); i++) {
			if (Character.isDigit(name.charAt(i)) == true) {
				throw new RuntimeException("Name can't have digit ! ");
			}
		}

		for (int i = 0; i < specialChars.length; i++) {
			if (name.contains(specialChars[i] + "")) {
				throw new RuntimeException("Name can't have special character");
			}
		}

		// Password
		System.out.println("Enter password: ");
		String password = ip.nextLine();

		if (password.length() < 8 || password.length() > 63) {
			throw new RuntimeException("Password too short or too long!");
		}

		boolean isExistSpecialChar = false;
		for (int i = 0; i < specialChars.length; i++) {
			if (password.contains(specialChars[i] + "")) {
				isExistSpecialChar = true;
			}
		}

		if (isExistSpecialChar) {
			throw new RuntimeException("Password must have at least 1 special letter");
		}

		String checkCapitalLetterInPassWord = password.toLowerCase();
		if (checkCapitalLetterInPassWord.equals(password)) {
			throw new RuntimeException("Password must have at least 1 capital letter");

		}

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Enter date of birth: dd/mm/yyyy !");
		String dateOfBirth = ip.nextLine();
		LocalDate dob = LocalDate.parse(dateOfBirth, formatter);

		return new Student(id, name, password, dob);

	}
}
