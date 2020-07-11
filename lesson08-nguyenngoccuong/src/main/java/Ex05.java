
public class Ex05 {

	public static void main(String[] args) {
		String s1 = "ABCEDEABC";
		String s2 = "ABCEDCBBCK";
		System.out.println(longestSubString(s1, s2));
	}

	public static String longestSubString(String s1, String s2) {
		String longestSubString = "";
		String subString = "";
		for (int i = 0; i < s1.length(); i++) {
			for (int j = i + 1; j <= s1.length(); j++) {
				subString = s1.substring(i, j);
				if (!s2.contains(subString)) {
					break;
				}
				if (subString.length() > longestSubString.length()) {
					longestSubString = subString;
				}
			}
		}
		return longestSubString;
	}

}
