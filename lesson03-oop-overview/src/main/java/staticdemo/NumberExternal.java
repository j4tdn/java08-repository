package staticdemo;

public class NumberExternal {
	public static void main(String[] args) {
		// static: class scope
		Number.sub();

		// non-static: class scope
		Number n1 = new Number();
		n1.sum();

		System.out.println("==========================");

		int a = 10;
		int b = 5;
		
		System.out.println(MathUtils.sub(a, b));
		System.out.println(MathUtils.sum(a, b));

	}
}
