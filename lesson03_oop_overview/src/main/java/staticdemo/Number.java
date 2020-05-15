package staticdemo;

public class Number {
	private int a;
	private static int b;

	public static void main(String[] args) {
		Number n1 = new Number();
		n1.a = 10;
		System.out.println(n1.a);
		n1.b = 20;
		System.out.println(n1.b);
		System.out.println("====================");
		int m = 5;
		int n = 10;
		//MathUntils mathUntils = new MathUntils();
		System.out.println("sum = " + MathUntils.sum(m, n));
		System.out.println("sub = " + MathUntils.sub(m, n));
	}

	public int sum() {
		return 5 + 7;
	}

	public static int sub() {
		return 5 - 7;
	}
	

}
