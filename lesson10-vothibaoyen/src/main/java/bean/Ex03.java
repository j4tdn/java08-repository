package bean;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		String[] strings = { "-2", "-6", "10", null, "4", "8", null,"Special","a","c", "b", "xx" };
		 sortInc(strings);
		 //sortDec(strings);
		Arrays.stream(strings).forEach(s -> System.out.print(" " + s));
	}

	public static boolean isNumeric(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static void sortInc(String[] s) {
		for (int i = s.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				
				if (s[i] == null) {
					continue;
				}
				
				if (isNumeric(s[j]) && isNumeric(s[i])) {
					if (Integer.parseInt(s[i])-Integer.parseInt(s[j])<0) {
						String tmp = s[j];
						s[j] = s[i];
						s[i] = tmp;
					}
					continue;
				}				
				if (s[i].compareTo("Special") == 0) {
					String tmp = s[j];
					s[j] = s[i];
					s[i] = tmp;
					continue;
				}
				if (s[j] == null || s[i].compareTo(s[j]) < 0 && s[j]!="Special") {
					String tmp = s[j];
					s[j] = s[i];
					s[i] = tmp;
				}
			}
		}
	}

	public static void sortDec(String[] s) {
		for (int i = s.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (s[j] == null) {
					continue;
				}
				

				if (isNumeric(s[j]) && isNumeric(s[i])) {
					if (Integer.parseInt(s[j]) -Integer.parseInt(s[i])<0) {
						String tmp = s[j];
						s[j] = s[i];
						s[i] = tmp;
					}
					continue;
				}
				
				if (s[j].compareTo("Special") == 0) {
					String tmp = s[j];
					s[j] = s[i];
					s[i] = tmp;
					continue;
				}
				if (s[i] == null || s[j].compareTo(s[i]) < 0 && s[i]!="Special") {
					String tmp = s[j];
					s[j] = s[i];
					s[i] = tmp;
				}
			}
		}
	}

}
