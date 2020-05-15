package j4t.datatype;

public class Ex02PrimitiveEx {

	public static void main(String[] args) {
		int a = 10;
		System.out.println("a :" + a);
		modified(a);
		System.out.println("a :" + a);

		int b = 20;
		int c = b;
		b = 15;
		System.out.println("a :" + b);
		System.out.println("a :" + c);

	}

	public static void modified(int x) {
		x = 20;
	}

}
