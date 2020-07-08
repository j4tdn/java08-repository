

import java.util.Arrays;

public class Bai7 {
	public static void main(String[] args) {
		String s = "aaabaaabbaaaaa";
		String[] xau = new String[s.length()];
		int count = 0;

		int i = 0;
		for (int j = i; j < xau.length; j++) {
			if (s.charAt(i) == s.charAt(j)) {
				xau[count] += s.charAt(j);
			} else {
				count++;
				xau[count] += s.charAt(j);
				i = j;
			}
		}
		xau = Arrays.copyOfRange(xau, 0, count + 1);
		for (String string : xau) {
			string = string.substring(4);
		}
		minmaxS(xau);

	}

	public static void minmaxS(String[] xau) {
		String min = xau[0];
		String max = xau[0];

		for (int i = 0; i < xau.length; i++) {

			if (min.length() >= xau[i].length()) {
				min = xau[i];
			}
			if (max.length() < xau[i].length()) {
				max = xau[i];
			}
		}
		min = min.substring(4);
		max = max.substring(4);
		System.out.println("Độ dài lớn nhất của dãy con đúng :" + min.length() + " " + min);
		System.out.println("Độ dài lớn nhất của dãy con đúng :" + max.length() + " " + max);

	}

}
