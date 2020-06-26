package util;

import immuatable.StringCounter;

public class StringUtil {
	
	public static  StringCounter count(String s) {
		int countLowers=0;
		int countUpers=0;
		int countDigits=0;
		for(int i=0;i<s.length();i++) {
			if(Character.isLowerCase(s.charAt(i))) {
				countLowers ++;
			}
			if(Character.isUpperCase(s.charAt(i))) {
				countUpers ++;
			}
			if(Character.isDigit(s.charAt(i))) {
				countDigits ++;
			}
		}
		
		
		return new StringCounter(countLowers, countUpers, countDigits);
	}
}
