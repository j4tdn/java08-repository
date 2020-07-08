package view;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex01 {
	public static void main(String[] args) {
		String s;
		Scanner scanner = new Scanner(System.in);
		int input;
		do {
			input = 0;
			System.out.println("Nhập vào chuỗi bất kỳ: ");
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

		System.out.println("Các ký tự có trong chuỗi là: ");
		InKyTu(s);
		System.out.println("Các từ có trong chuỗi là: ");
		InTu(s);
		System.out.println("Đảo kí tự: ");
		InDaoKiTu(s);
		System.out.println("Đảo từ: ");
		InDaoTu(s);
	}

	private static void InKyTu(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}

	private static void InTu(String s) {
		String[] Chuoi = s.trim().split("[\\s;:]+");
		for (String c : Chuoi) {
			System.out.println(c);
		}
	}

	private static void InDaoKiTu(String s) {
		for (int i = s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i)+" ");
		}
		System.out.print("\n");
	}
	
	private static void InDaoTu(String s) {
		String[] Chuoi = s.trim().split("[\\s;:]+");
		for (int i = Chuoi.length-1; i>=0; i--) {
			System.out.print(Chuoi[i] + " ");
		}
	}
}
