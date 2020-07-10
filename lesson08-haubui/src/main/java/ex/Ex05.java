package ex;

import static constant.DefaultPattern.WHITESPACE;

import utils.StringUtils;

public class Ex05 {
	public static void main(String[] args) {

		String s1 = "ABCEDEABCKAEH";
		String s2 = "ABCEDCBBCKAEFGN";
		String same = getSameSubstrings(s1, s2);

		System.out.println(getMaxSubstring(same));
	}

	private static String getSameSubstrings(String s1, String s2) {

		StringBuilder sameSubs = new StringBuilder(s2.length() > s1.length() ? s1 : s2);

		int minLength = Math.min(s1.length(), s2.length());

		for (int i = 0; i < minLength; i++) {
			if (minLength == s1.length() && sameSubs.charAt(i) != s2.charAt(i)
					|| minLength == s2.length() && sameSubs.charAt(i) != s1.charAt(i)) {
				sameSubs.setCharAt(i, ' ');
			}
		}
		return sameSubs.toString();
	}

	public static String getMaxSubstring(String input) {

		String[] subs = StringUtils.getWords(input.trim(), WHITESPACE);

		int maxLength = getMaxSubLength(subs);

		StringBuilder result = new StringBuilder();

		for (String sub : subs) {
			if (sub.length() == maxLength) {
				result.append(sub + "\n");
			}
		}

		return result.toString();
	}

	private static int getMaxSubLength(String[] substrings) {
		int max = 0;
		for (String sub : substrings) {
			max = Math.max(max, sub.length());
		}
		return max;
	}
}
