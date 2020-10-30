package lambda;
//anonymous class = anonymous function = lambda 
// using global var (attribute ) with no restriction
// using local var: with final

public class LocalVariable {
	public static  int b1;
	public static void main(String[] args) {
		test();
	}
	private static void test () {
		//local variable
		final int a=10;
		Runnable runnable = ()->{
			//a= 8;
			System.out.println(a);
		 b1 = 100;
		 System.out.println(b1);
		};
		runnable.run();
	}
}
