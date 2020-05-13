package staticdemo;

public class Number {
	private int a;
	private static int b;

	public static void main(String[] args) {
		Number n1 = new Number();
		n1.a = 10;
		b = 99;

		Number n2 = new Number();
		n2.a = 20;

		System.out.println(n2.a);
		System.out.println(n2.b);
		
		int m = 10;
		int n = 5;
		System.out.println("sum: " + MathUtils.sum(m, n));
		System.out.println("sub: " + MathUtils.sub(m, n));
	}

	public int sum() {
		return 5 + 7;
	}

	public static int sub() {
		return 5 - 7;
	}
}
