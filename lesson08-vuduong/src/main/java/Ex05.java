
public class Ex05 {
	public static void main(String[] args) {
		String s1 = "XkkkkkkkkkkkkkkkkkkkkkkkkkkYZABCDEKMN";
		String s2 = "ABCDEQERkkkkkkkkkkkkkkkkkT";
		System.out.println(subString(s1, s2));

	}

	public static String subString(String s1, String s2) {
		String longestSubString = "";

		String temp = "";

		for (int i = 0; i < s1.length(); i++) {
			for (int j = i + 1; j < s1.length() + 1; j++) {
				temp = s1.substring(i, j);
				if (s2.contains(temp) && (temp.length() > longestSubString.length())) {
					longestSubString = temp;
				}
			}
		}

		return longestSubString;
	}

}
