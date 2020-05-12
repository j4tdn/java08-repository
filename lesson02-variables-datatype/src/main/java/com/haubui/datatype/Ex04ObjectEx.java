package com.haubui.datatype;

public class Ex04ObjectEx {

	public static void main(String[] args) {
		Integer a = new Integer(10);

		System.out.println(a);
		System.out.println("a1 system hashcode " + System.identityHashCode(a));
		modified(a);
		System.out.println(a);
		System.out.println("a2 system hashcode " + System.identityHashCode(a));

		System.out.println("----------------");

		Integer x = new Integer(17);
		Integer y = new Integer(22);

		swap(x, y);
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}

	private static void modified(Integer x) {
		x = 20;
	}

	private static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}
