package ex;

public class Ex07 {

	public static void main(String[] args) {
		String input = "aaabaaabbaaaaac";
		String[] subs = findTrueSubstrings(input);
		System.out.println("Độ dài lớn nhất của dãy con đúng : " + getMaxSubs(subs));
		System.out.println("Độ dài nhỏ nhất của dãy con đúng : " + getMinSubs(subs));
	}

	private static String[] findTrueSubstrings(String input) {

		StringBuilder temp = new StringBuilder(input);

		temp.append("+");

		StringBuilder subs = new StringBuilder();

		int count = 1;

		for (int i = 0; i < temp.length() - 1; i++) {

			if (temp.charAt(i) != temp.charAt(i + 1)) {
				subs.append(temp.substring((i + 1 - count), i + 1));
				subs.append(" - " + count + " - ");
				subs.append("[" + (i + 1 - count) + "]");
				subs.append(",");
				count = 0;
			}
			count++;
		}
		return subs.toString().trim().split("[,]+");
	}

	public static String getMaxSubs(String[] subs) {

		StringBuilder result = new StringBuilder();

		int maxLength = 0;

		for (String sub : subs) {
			maxLength = Math.max(maxLength, sub.replaceAll("[^a-z]+", "").trim().length());
		}

		for (String sub : subs) {
			if (maxLength == sub.replaceAll("[^a-z]+", "").trim().length()) {
				result.append(sub + ", ");
			}
		}

		result.setCharAt(result.length() - 2, ' ');

		return result.toString().trim();
	}

	public static String getMinSubs(String[] subs) {
		StringBuilder result = new StringBuilder();

		int minLength = subs[0].replaceAll("[^a-z]+", "").trim().length();

		for (String sub : subs) {
			minLength = Math.min(minLength, sub.replaceAll("[^a-z]+", "").trim().length());
		}

		for (String sub : subs) {
			if (minLength == sub.replaceAll("[^a-z]+", "").trim().length()) {
				result.append(sub + ", ");
			}
		}

		result.setCharAt(result.length() - 2, ' ');

		return result.toString().trim();
	}

}
