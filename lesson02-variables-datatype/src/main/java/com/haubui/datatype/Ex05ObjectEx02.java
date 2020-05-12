package com.haubui.datatype;

public class Ex05ObjectEx02 {
	public static void main(String[] args) {

		int a = 5;
		int b = 10;

		swap(a, b = a);

		System.out.println("_______________");

		Int x = new Int(88);
		Int y = new Int(44);

		swap(x, y);
		
		System.out.println(x);
		System.out.println(y);
	}

	private static int swap(int a, int b) {
		return a;
	}

	private static void swap(Int a, Int b) {
		int temp = a.value;
		a.value = b.value;
		b.value = temp;
	}
}

class Int {
	public int value;

	public Int(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Int [value=" + value + "]";
	}

}
