package exercise;

import java.util.Arrays;
import java.util.logging.Logger;

public class Ex02 {
	public static void main(String[] args) {
//copy Array.arrayof 
//		Arrays.copyOfRange(original, from, to)
		String[] list = getLargestNumbers("01a2b3456cde478", "aa6b546c6e22h", "aa6b326c6e22h");
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

	private static String[] getLargestNumbers(String... ss) {
		String[] number = new String[ss.length];
		// get list number from string
		// compare numbers in string and get max number

		for (int i = 0; i < number.length; i++) {
			number[i] = getMaxInList(getNumbersString(ss[i]));
		}
		return number;
	}

	private static String[] getNumbersString(String s) {
		String[] string = s.split("[a-z]");
		return string;
	}

	private static String getMaxInList(String[] list) {
		int max = 0;
		for (String string : list) {
			if (!string.isEmpty()) {
				if (Integer.parseInt(string) > max) {
					max = Integer.parseInt(string);
				}
			}
		}
		return String.valueOf(max);
	}
}
