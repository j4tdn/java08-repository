package utils;

import immuatatble.StringCounter;

public class StringUtils {
	private StringUtils() {

	}

	public static StringCounter count(String s) {
		int lower = 0;
		int upper = 0;
		int digital = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLowerCase(s.charAt(i))) {
				lower++;
			} else if (Character.isUpperCase(s.charAt(i))) {
				upper++;
			} else if (Character.isDigit(s.charAt(i))) {
				digital++;
			}
		}
		return new StringCounter(lower, upper, digital);
	}
}
