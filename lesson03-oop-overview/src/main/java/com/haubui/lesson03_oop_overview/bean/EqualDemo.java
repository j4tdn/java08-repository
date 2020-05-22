package com.haubui.lesson03_oop_overview.bean;

public class EqualDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		System.out.println(a == b);

		Integer ia = 10;
		Integer ib = 5;
		Integer ic = 5;
		Integer id = new Integer(20);
		Integer ie = new Integer(20);

		System.out.println("&ia: " + System.identityHashCode(ia));
		System.out.println("&ib: " + System.identityHashCode(ib));
		System.out.println("&ic: " + System.identityHashCode(ic));

		System.out.println("ia == ib: " + (ia == ib));
		System.out.println("ib == ic: " + (ib == ic));
		System.out.println("id == ie: " + (id == ie));
		System.out.println("id equal ie: " + (id.equals(ie)));

		String sa = "hello";
		String sb = "xinchao";
		System.out.println("sa == sb: " + (sa == sb));
		System.out.println("sa equal sb: " + (sa.equals(sb)));

	}
}
