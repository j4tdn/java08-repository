package staticdemo;

public class NumberExternal {

	public static void main(String[] args) {
		//no-static: oject scope
		Number n1=new Number();
		System.out.println( n1.sum());
		System.out.println( Number.sub());
		System.out.println("===============");
		
		int a=10;
		int b=5;
		
		System.out.println( MathUtils.sum(a, b));
		System.out.println(MathUtils.sub(a, b));
	}

}
