package utils;

import java.util.function.Consumer;

import immuatable.StringCounter;

public class StringUtils {

	private StringUtils() {
	}

	public static StringCounter count(String s) {
		int upperChars = 0;
		int lowerChars = 0;
		int digits = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				upperChars++;
			} else if (Character.isLowerCase(s.charAt(i))) {
				lowerChars++;
			} else if (Character.isDigit(s.charAt(i))) {
				digits++;
			}
		}
		return new StringCounter(upperChars, lowerChars, digits);
	}
	
	public static void forEach(String[] elements, Consumer<String> consumer) {
		for (String element : elements) {
			consumer.accept(element);
		}
	}
	
	public static String sort(String str) {
		return str.chars()		
				  .sorted()
				  .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	              .toString();
	}
}
