package staticdemo;

public class Number {
	private int a;
	private static int b;
	public static void main(String[] args) {
		Number n1=new Number();
		n1.a=10;
		n1.b=99;
		System.out.println(n1.a);
		System.out.println(n1.b);
		
		int a=10;
		int b=5;
		
		System.out.println( MathUtils.sum(a, b));
		System.out.println(MathUtils.sub(a, b));
		
	}
	public int sum() {
		return 5+2;
	}
	public static int sub() {
		return 2-6;
	}
}
