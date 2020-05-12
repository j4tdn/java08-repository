package staticdemo;

public class Number {
	private int a;
	private static int b;

	public static void main(String[] args) {
		Number n1 = new Number();

		int m = 5;
		int n = 10;
		
		System.out.println(MathUtils.sub(m, n));
		System.out.println(MathUtils.sum(m, n));
		
	}

	public int sum() {
		return 12;
	}

	public static int sub() {
		return -1;
	}

}
