
public class Ex07 {
	public static void main(String[] args) {
		System.out.println(maxSubString("aabbbbccddd"));

		System.out.println(minSubString("aaaabbbbbbbbbbddddddddeeeee"));
	}

	private static String maxSubString(String s) {
		String temp = s.charAt(0) + "";
		String maxString = "";

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				temp = temp + s.charAt(i - 1);
			} else {
				temp = s.charAt(i) + "";
			}

			if (temp.length() > maxString.length()) {
				maxString = temp;
			}
		}

		return maxString;
	}

	private static String minSubString(String s) {
		String minString = s;
		String temp = s.charAt(0) + "";
		
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				temp += s.charAt(i);
			} else {
				if (temp.length() < minString.length()) {
					minString = temp;
				}

				temp = s.charAt(i) + "";
			}
		}

		return minString;
	}
}
