package staticdemo;

public class NumberExternal {

	public static void main(String[] args) {
		//non-static: object scope
		Number n1 = new Number();
		n1.sum();
		
		//static: class scope
		Number.sub();
		System.out.println("=============================");
		int a = 10;
		int b = 5;
		System.out.println("sum: " + MathUtils.sum(a, b));
		System.out.println("sub: " + MathUtils.sub(a, b));
	}

}
