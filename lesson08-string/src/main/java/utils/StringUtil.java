package utils;

import java.util.function.Consumer;

import immutable.StringCounter;

public class StringUtil {
	private StringUtil() {}
	
	public static StringCounter counter(String s) {
		
		int countLowerChars = 0;
		int countUpperChars = 0;
		int countDigits = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLowerCase(s.charAt(i)) ) countLowerChars++;
			else if (Character.isUpperCase(s.charAt(i))) countUpperChars++;
			else if (Character.isDigit(s.charAt(i))) countDigits++;
		}
		
		return new StringCounter(countLowerChars, countUpperChars, countDigits);
	}
	
	public static void forEach(String[] array, Consumer<String> consumer) {
		for (String element : array) {
			// will call accept method at Runtime
			consumer.accept(element);
		}
	}
}
