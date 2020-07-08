package view;

public class Ex05 {
	public static void main(String[] args) {
		String s1 = "ABCEDEABC";
		String s2 = "ABCEDCBBCK";
		System.out.println(LCS(s1, s2));
	}

	private static String LCS(String s1, String s2) {
		int l1 = s1.length();
		int l2 = s2.length();

		int[][] a = new int[l1 + 1][l2 + 1];
		int len = 0, pos = 0;

		for (int i = 1; i < l1 + 1; i++) {
			for (int j = 1; j < l2 + 1; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					a[i][j] = a[i - 1][j - 1] + 1;
					if (a[i][j] > len) {
						len = a[i][j];
						pos = i;
					}
				} else
					a[i][j] = 0;
			}
		}

		return s1.substring(pos - len, pos);
	}
}
