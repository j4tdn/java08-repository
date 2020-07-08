package view;

public class Ex07 {
	public static void main(String[] args) {
		String s = "aaabaaabbaaaaa";
		System.out.println(checkmax(s));

	}

	public static String checkmax(String s) {
		int l = s.length();

		int[] a = new int[l + 1];
		int len = 0, pos = 0;

		for (int i = 1; i < l + 1; i++) {
			for (int j = 1; j < l + 1; j++) {
				if (s.charAt(i - 1) == s.charAt(j - 1)) {
					a[i] = a[i - 1] + 1;
					if (a[i] > len) {
						len = a[i];
						pos = i;
					}
				} else
					a[i] = 0;
			}
		}

		return s.substring(pos - len, pos);
	}
}
