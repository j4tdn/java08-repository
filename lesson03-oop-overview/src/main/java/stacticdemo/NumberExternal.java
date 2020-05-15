package stacticdemo;

public class NumberExternal {

	public static void main(String[] args) {
		// non-static : object scope
		Number n1 = new Number();
		n1.sum();

		// static: class scope
		Number.sub();
		System.out.println("================");
		int a = 10;
		int b = 5;

		System.out.println(MathUtils.sum(a, b));
		System.out.println(MathUtils.sub(a, b));

	}

}
