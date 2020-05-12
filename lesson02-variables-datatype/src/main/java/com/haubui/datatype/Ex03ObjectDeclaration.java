package com.haubui.datatype;

public class Ex03ObjectDeclaration {
	public static void main(String[] args) {

		Integer i = new Integer(5);
		Float f = new Float(10.2f);
		Character c = new Character('x');
		String s = new String("Java08");

		System.out.println("i: " + i);
		System.out.println("f: " + f);
		System.out.println("c: " + c);
		System.out.println("s: " + s);

		System.out.println("c is a digit: " + Character.isDigit(c));
	}
}
