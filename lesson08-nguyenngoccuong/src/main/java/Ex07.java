
public class Ex07 {

	public static void main(String[] args) {
		String s = "aaabaaabbaaaaa";
		System.out.println(maxLengthSubString(s));
		System.out.println(minLengthSubString(s));
	}

	public static int maxLengthSubString(String s) {
		int max = 1;
		int length = 1;
		for (int i = 0; i < s.length(); i++) {
			if (i + 1 == s.length()) {
				break;
			}
			if (s.charAt(i) == s.charAt(i + 1)) {
				length += 1;
			} else {
				if (length > max) {
					max = length;
				}
				length = 1;
			}
		}
		return (max > length) ? max : length;
	}
	
	public static int minLengthSubString(String s) {
		int min = Integer.MAX_VALUE;
		int length = 1;
		for (int i = 0; i < s.length(); i++) {
			if (i + 1 == s.length()) {
				break;
			}
			if (s.charAt(i) == s.charAt(i + 1)) {
				length += 1;
			} else {
				if (length < min) {
					min = length;
				}
				length = 1;
			}
		}
		return (min < length) ? min : length;
	}

}
