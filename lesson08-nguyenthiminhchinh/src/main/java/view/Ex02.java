package view;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02 {

	public static void main(String[] args) {
		String s;
		Scanner scanner = new Scanner(System.in);
		int input;
		do {
			input = 0;
			System.out.println("Nhập họ và tên: ");
			s = scanner.nextLine();
			Pattern special = Pattern.compile("[$&+,:;=?@#|]");
			Matcher hasSpecial = special.matcher(s);
			boolean b = hasSpecial.find();
			for (int i = 0; i < s.length(); i++) {
				if (Character.isDigit(s.charAt(i)) || b == true) {
					input++;
				}
			}
			// System.out.println(input);
		} while (input != 0);
		System.out.println("Họ và tên là: " + FisrtUpperCase(s));
	}

	private static String FisrtUpperCase(String s) {
		String[] arr = s.toLowerCase().trim().split("[\\s;:]+");
		String s1 = "";
		for (String x : arr) {
			s1 = s1 + (x.substring(0, 1).toUpperCase() + x.substring(1));
			s1 = s1 + " ";
		}
		return s1;
	}
}
