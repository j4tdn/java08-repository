package com.haubui.datatype;

public class Ex02PrimitiveEx {
	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
		modified(a);
		System.out.println(a);

		System.out.println("----------");

		int b = 20;
		int c = b;
		c = 15;
		
		System.out.println(b);
		System.out.println(c);

	}

	private static void modified(int x) {
		x = 20;
	}
}
