package utils;

import immuatable.StringCounter;

public class StringUtils {
	private StringUtils() {
		
	}
	
	public static StringCounter counter(String s) {
		int countDigits = 0;
		int countLowerChars = 0;
		int countUpperChars = 0;
		
		
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLowerCase(s.charAt(i))){
				countLowerChars++;
				continue;
			}
			
			if (Character.isUpperCase(s.charAt(i))){
				countUpperChars++;
				continue;
			}
			
			if (Character.isDigit(s.charAt(i))){
				countDigits++;
			}
			
		}	
		return new StringCounter(countLowerChars, countUpperChars, countDigits);
		
	}
}
