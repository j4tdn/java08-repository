package Exercises;

public class Ex05 {
	public static void main(String[] args) {
		String s1 = "ABCEDEABC";
		String s2 = "ABCEDCBBCK";

		//System.out.println(commonString(s1, s2));
	}

	public static String commonString(String s1, String s2) {
		String commonString = "";
		int[][] arr = new int[s1.length() + 1][s2.length() + 1];

		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
//					//commonString += s1.charAt(j) + "  ";
//					arr[i][j] = arr[i][j] + 1;
//				} else {
//					arr[i][j] = 0;
				}
			}
		}
		return commonString;
	}
	
}
