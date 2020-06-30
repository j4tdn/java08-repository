package utils;

import java.util.function.Consumer;

import immutable.CountCharacter;

public class StringUtils {
	private StringUtils() {
		// TODO Auto-generated constructor stub
	}

	public static void forEach(String[] elements, Consumer<String> consumer) {
		for (String element : elements) {
			consumer.accept(element);
		}
	}

	public static CountCharacter stringCounter(String str) {
		int numberOfLowerChars = 0, numberOfUpperChars = 0, numberOfDigit = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				numberOfLowerChars++;
			}
			if (Character.isUpperCase(str.charAt(i))) {
				numberOfUpperChars++;
			}
			if (Character.isDigit(str.charAt(i))) {
				numberOfDigit++;
			}
		}

		//
		return new CountCharacter(numberOfLowerChars, numberOfUpperChars, numberOfDigit);
	}
}
