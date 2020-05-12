package com.haubui.lesson03_oop_overview.staticdemo;

public class NumberExternal {
	public static void main(String[] args) {
		Number n1 = new Number();
		n1.sum();
		Number.sub();

		int a = 10;
		int b = 5;

		System.out.println("sum: " + MathUtils.sum(a, b));
		System.out.println("sub: " + MathUtils.sub(a, b));
	}
}
