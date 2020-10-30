package lambda;

// anonymous class = anonymous function = lambda
// use global var (attribute: thuoc class) with no restriction 
// using local var: required final for local variable

public class LocalVariable {
	private int b;
	
	public static void main(String[] args) {
		
	}
	
	private void test() {
		// local variable
		int a = 10;
		Runnable runnable = () -> {
//			a = 15;			
			System.out.println(a);
			
			b = 100;
			System.out.println(b);
		};
		
		runnable.run();
	}
}
