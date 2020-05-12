package com.haubui.view;

public class Ex01 {
	
	public static void main(String[] args) {
		System.out.println(sort(7, 3, 5));
	}

	private static String sort(int a, int b, int c) {
		int sum = a + b + c;
		int max = Math.max(a, Math.max(b, c));
		int min = Math.min(a, Math.min(b, c));
		int medium = sum - max - min;
		return min + ", " + medium + ", " + max;
	}
}
