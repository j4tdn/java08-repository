package utils;

import java.util.function.Consumer;

import immuatable.StringCounter;

public class StringUtils {
	private StringUtils() {
	}
	public static void foreach(String[] elements, Consumer<String> consumer) {
		for (String element : elements) {
			consumer.accept(element);
		}
	}

	public static StringCounter count(String s) {
		int uper = 0;
		int lower = 0;
		int digital = 0;
		StringCounter s1 = new StringCounter();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLowerCase(s.charAt(i))) {
				lower++;
				continue;
				
			}
			if (Character.isUpperCase(s.charAt(i))) {
				uper++;
				continue;
			}
			if (Character.isDigit(s.charAt(i))) {
				digital++;
			}
		}
		s1.setNumberoflowerchar(lower);
		s1.setNumberofuperchar(uper);
		s1.setNumberofdigital(digital);
		
		return s1;
	}
}
