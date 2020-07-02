package utils;

import java.util.function.Consumer;

import immutable.StringCounter;

public class StringUtils {

	private StringUtils() {
	}

	public static StringCounter count(String s) {
		int numberOfLowerChars = 0;
		int numberOfUpperChars = 0;
		int numberOfDigits = 0;

		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				numberOfDigits++;
			} else if (Character.isLowerCase(s.charAt(i))) {
				numberOfLowerChars++;
			} else if (Character.isUpperCase(s.charAt(i))) {
				numberOfUpperChars++;
			}
		}

		return new StringCounter(numberOfLowerChars, numberOfUpperChars, numberOfDigits);
	}
	public static void forEach(String[] elements, Consumer<String> consumer) {
		for (String element: elements) {
			consumer.accept(element);
		}
	}
}