package com.haubui.lesson03_oop_overview.staticdemo;

public class StaticDemo {
	public static void main(String[] args) {
		printf("Hê lô!!!!!!!!!!!!!!!!!");
	}

	private static void printf(String s) {
		System.out.println("value: " + s);
	}

	private void cout(String s) {
		System.out.println("value: " + s);
		printf(s);
	}
}
