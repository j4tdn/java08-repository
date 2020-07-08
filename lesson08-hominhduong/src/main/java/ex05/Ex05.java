package ex05;

public class Ex05 {
	public static void main(String[] args) {
		String s1 = "ABCDEABC";
		String s2 = "ABCDCBBCK";

		if (s1.length() < s2.length()) {
			int indexArr = 0;
			String[] arrString = new String[s1.length()];
			initEmptyString(arrString);
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) == s2.charAt(i)) {
					arrString[indexArr] += s1.charAt(i);
				} else {
					indexArr++;
				}
			}

			String maxString = arrString[0];
			int indexMax = 0;
			for (int i = 0; i < arrString.length; i++) {
				if (arrString[i].length() > maxString.length()) {
					indexMax = i;
				}
			}
			System.out.println("Max: " + arrString[indexMax]);
		}

	}

	public static void initEmptyString(String[] strSame) {
		for (int i = 0; i < strSame.length; i++) {
			strSame[i] = "";
		}
	}
}
