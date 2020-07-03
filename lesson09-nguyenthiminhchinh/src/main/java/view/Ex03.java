package view;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		String input = "xyz";
		String[] s = input.split("");
		permutation(s, s.length);
	}
	
	private static void permutation(String[] s, int x) {
		if (x == 1) {
			System.out.println(Arrays.toString(s));
		} else {
			for (int i = 0; i < x; i++) {
				permutation(s, x - 1);
				if (x % 2 == 1) {
					swap(s, 0, x - 1);
				} else {
					swap(s, i, x - 1);
				}
			}
		}
	}
	private static void swap(String[] s, int right, int left) {
		String temp = s[right];
		s[right] = s[left];
		s[left] = temp;
	}
}
