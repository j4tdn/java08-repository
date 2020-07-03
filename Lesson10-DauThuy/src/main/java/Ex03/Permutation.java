package Ex03;

import java.util.Arrays;

public class Permutation {
	public static void main(String[] args) {
		String str = "xyz";
		int n = str.length();

		String[] result = permutation(str, 0, n - 1);
	}

	private static String[] permutation(String str, int l, int r) {
		String[] students = new String[10];
		int count = 0;
		if (l == r) {
			System.out.println(str);
			students[count] = str;
			
		} else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permutation(str, l + 1, r);
				str = swap(str, l, i);
				students[count] = str;
				count++;
			}
		}
		return Arrays.copyOfRange(students, 0, count);
	}

	public static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
}
