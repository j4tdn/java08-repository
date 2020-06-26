package utils;

import immuatable.StringCount;

public class StringUtils {
	// private cho utils de k khoi tao
	private StringUtils() {

	}

	public static StringCount StringCounter(String a) {
		int up = 0;
		int low = 0;
		int number = 0;
		for (int i = 0; i < a.length(); i++) {
			if (Character.isLowerCase(a.charAt(i))) {
				up++;
			}
			if (Character.isUpperCase((a.charAt(i)))) {
				low++;
			}
			if (Character.isDigit(a.charAt(i))) {
				number++;
			}
		}

		return new StringCount(up, low, number);
	}
}
