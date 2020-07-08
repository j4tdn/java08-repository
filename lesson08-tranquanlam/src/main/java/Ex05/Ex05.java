package Ex05;

public class Ex05 {

	public static void main(String[] args) {
		String s1 = "ABCEDEABCGJKJJK";
		String s2 = "ABCEDCBBCK";

		int max = s1.length() > s2.length() ? s2.length() : s1.length();
		String commonChild = "";
		String listChild = "";
		for (int i = 0; i < max; i++) {
			if (s1.charAt(i) == s2.charAt(i)) {
				commonChild += s1.charAt(i);
				if (i == max - 1) {
					listChild = listChild + " " + commonChild;
				}
			} else {
				listChild = listChild + " " + commonChild;
				commonChild = "";
			}
		}

		String[] listCommon = listChild.trim().split("[\\s]+");
		String lenghtMax = "";
		for (int i = 0; i < listCommon.length; i++) {
			if (listCommon[i].length() > lenghtMax.length()) {
				lenghtMax = listCommon[i];

			}
		}

		System.out.println(lenghtMax);

	}

}
