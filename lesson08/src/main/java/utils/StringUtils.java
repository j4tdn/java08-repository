package utils;

import immutable.StringCount;

public class StringUtils {
	private StringUtils() {
	}

	public static StringCount count(String s) {
		int numberOfLower = 0;
		int numberOfUpper = 0;
		int numberOfDitgit = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				numberOfDitgit++;
				continue;
			}

			if (Character.isLowerCase(s.charAt(i))) {
				numberOfLower++;
				continue;
			}

			if (Character.isUpperCase(s.charAt(i))) {
				numberOfUpper++;
				continue;

			}
		}

		return new StringCount(numberOfLower, numberOfUpper, numberOfDitgit);
	}

}
