package exercises;

public class Ex05 {

	public static void main(String[] args) {
		String s1 = "ABCEDEABC";
		String s2 = "ABCEDCBBCK";
		System.out.println(findLongestSubstring(s1, s2));

	}
	private static String findLongestSubstring(String s1, String s2) {
		String longestString = "";
		String sub = "";
		for (int i = 0; i < s1.length(); i++) {
			for (int j = i + 1; j <= s1.length(); j++) {
				sub = s1.substring(i, j);
				if(sub.length()>longestString.length() && s2.contains(sub)) {
					longestString = sub;
				}
				
			}
			
		}
		return longestString;
	}

}
