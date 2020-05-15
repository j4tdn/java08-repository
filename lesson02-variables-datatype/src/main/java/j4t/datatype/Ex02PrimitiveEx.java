package j4t.datatype;

public class Ex02PrimitiveEx {

	public static void main(String[] args) {
		// 3.00.00
		int a = 10;
		modified(a);
		System.out.println("a: " + a);
		System.out.println("================");
		int b = 20;
		int c = b;
		b = 15;
		System.out.println("c" + c);
		System.out.println("b" + b);
	}

	private static void modified(int a) {
		a = 20;
	}
}
