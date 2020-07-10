package ex;

import java.util.Scanner;

import utils.StringUtils;

import static constant.DefaultPattern.WHITESPACE;

public class Ex02 {

	public static Scanner sc = new Scanner(System.in);

	public static String inputName() {
		String ipName = "";

		while (true) {
			System.out.println("Enter Name: ");

			ipName = sc.nextLine();

			if (StringUtils.removeDiacritic(ipName).matches("[a-zA-Z ]{2,}")) {
				break;
			}
			
			System.out.println("Please enter valid name!!!");
		}
		return ipName;
	}

	public static String rename(String name) {
		StringBuilder newName = new StringBuilder();

		String[] words = StringUtils.getWords(name.trim().toLowerCase(), WHITESPACE);

		for (String word : words) {
			newName.append(word + " ");
			newName.setCharAt(newName.indexOf(word), Character.toUpperCase(word.charAt(0)));
		}

		return newName.toString().trim();
	}

	public static void main(String[] args) {
		String name = inputName();
		System.out.println(rename(name));
	}
}
