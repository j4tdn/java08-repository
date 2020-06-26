package utils;

import immuatable.StringCounter;

public class StringUtils {
	private StringUtils() {

	}

	public static StringCounter count(String s) {
		int uper = 0;
		int lower = 0;
		int digital = 0;

		for (int i = 0; i < s.length(); i++) {
			if (Character.isLowerCase(s.charAt(i))) {
				lower++;
				
				
			}
			else if (Character.isUpperCase(s.charAt(i))) {
				uper++;
				
			}
			else  {
				digital++;
			}
		}

		return new StringCounter(uper, lower, digital);
	}
}
