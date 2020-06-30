package utils;

import immutable.StringCounter;

public class StringUtils {
	
	private StringUtils() {
		
	}
	 
	public static StringCounter counter(String s) {	
		int countLowerCase = 0;
		int countUpperCase = 0;
		int countDigit = 0;
		for (int i = 0; i < s.length(); i++) {
			if(Character.isLowerCase(s.charAt(i))) {
				countLowerCase++;
			}
			else if(Character.isUpperCase(s.charAt(i))) {
				countUpperCase++;
			}
			else if(Character.isDigit(s.charAt(i))) {
				countDigit++;
			}	
		}
		return new StringCounter(countUpperCase, countLowerCase, countDigit);
		
	}

	
}
