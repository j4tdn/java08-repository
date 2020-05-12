package com.haubui.lesson03_oop_overview.staticdemo;

public class Number {
	private int a;
	private static int b;

	public static void main(String[] args) {
		Number n1 = new Number();
		n1.a = 10;
		b = 99;

		System.out.println(n1.a);
		System.out.println(b);

		Number n2 = new Number();
		n2.a = 20;

		System.out.println(n2.a);
		System.out.println(b);
	}

	public int sum() {
		return 5 + 7;
	}

	public static int sub() {
		return 5 - 7;
	}
}
