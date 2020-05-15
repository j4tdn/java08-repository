package StaticDemo;

public class NumberExternal {
	public static void main(String[] args) {
		//non-static: object scope
		Number num = new Number();
		num.sum();
		//static: class scope
		Number.sub();	
		System.out.println("======================");
		int a = 10;
		int b = 5;
		//MathUtils util = new MathUtils();
		System.out.println("sum: " + MathUtils.sub(a, b));
		System.out.println("sum: " + MathUtils.sum(a, b));
		
	}	
}
