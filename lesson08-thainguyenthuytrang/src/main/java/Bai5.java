

import java.util.Arrays;

public class Bai5 {
	public static void main(String[] args) {
		String s1 = "abcedeabc";
		String s2 = "abcedcbbck";

		int n = (s1.length() < s2.length()) ? s1.length() : s2.length();

		String[] max = new String[n];
		int count = 0;

		for (int i = 0; i < n; i++) {
			if (s1.charAt(i) == s2.charAt(i)) {
				max[count] += s1.charAt(i);
			} else {

				count++;
			}
		}

		String maxS = max[0];
		for (int i = 0; i < max.length; i++) {
			
			if (max[i] == null) {
				continue;
			}
			
			if (maxS.length() < max[i].length()) {
				maxS = max[i];
			}
		}

		maxS = maxS.substring(4);
		System.out.println(maxS);

	}

}
