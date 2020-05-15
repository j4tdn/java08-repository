package stacticdemo;

public class Number {

	private int a; // thuoc pham vi doi tuong, neu muon luu o heap thi phai khoi tao
	private static int b; // b la the hien cua class

	public static void main(String[] args) {
		Number n1 = new Number();
		n1.a = 10;
		n1.b = 99;
		System.out.println(n1.a);
		System.out.println(n1.b);

		Number n2 = new Number();
		n2.a = 20;
		b = 99;
		System.out.println(n2.a);
		System.out.println(n2.b);
		
		int a=10;
		int b=5;
		System.out.println("sum: " + MathUtils.sum(a, b));

		System.out.println("sub: " + MathUtils.sub(a, b));
	}

	public int sum() {
		return 12;
	}

	public static int sub() {
		return 5 - 7;
	}

}
