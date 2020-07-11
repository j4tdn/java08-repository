package utils;

import java.util.Scanner;

public class StringUtils {
	
	private static final Scanner input = new Scanner(System.in);
	
	private StringUtils() {
	}
	
	public static String input() {
		String str;
		System.out.print("Enter a string: ");
		do {						
			str = input.nextLine();
		} while (str.trim().length() == 0);
		return str;
	}
	
}
