package bean;

public class Ex05 {

	public static void main(String[] args) {

		String s1="ABCEDEABCCCCC";
		String s ="ABCEDCBBCCCCCK";
		System.out.println(timXauChungLonNhat(s, s1));
	}

	private static String timXauChungLonNhat(String s1, String s2) {
		String s="" ,sub;
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j <= s1.length() - (s1.length() - i); j++) {
				sub = s1.substring(j, s1.length() - i + j);
				if (s2.contains(sub)&& s.length()<sub.length()) {
					s=sub;
				}
			}
		}
		return s;
	}
}
