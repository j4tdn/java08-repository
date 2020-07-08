package Ex07;

public class Ex07 {

	public static void main(String[] args) {
		String s = "aaabaaabbaaaaa";
		String[] list = maxStringChild(s).trim().split("\\s");
		String maxlenght = list[0];
		String minlenght = list[0];
		for (String string : list) {
			if (string.length() > maxlenght.length()) {
				maxlenght = string;
			}
			if (string.length() < minlenght.length()) {
				minlenght = string;
			}
		}
		
		System.out.println(maxlenght + "[" + maxlenght.length() + "]");
		System.out.println(minlenght + "[" + minlenght.length() + "]");
	}

	public static String maxStringChild(String s) {

		char temp = s.charAt(0);
		String listString = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == temp) {
				listString = listString + s.charAt(i);
				temp = s.charAt(i);
			} else {
				temp = s.charAt(i);
				listString = listString + " " + s.charAt(i);
			}

		}

		return listString;
	}
}
