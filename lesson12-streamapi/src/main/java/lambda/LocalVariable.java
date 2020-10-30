package lambda;

// ANONYMOUS class = anonymous funcion = lambda
//using local var (attribute) with no restriction
// using local var: required final for local var

public class LocalVariable {
	private int b = 100; // biến thuộc tính
	
	public static void main(String[] args) {
		
	}
	private void test () {
		int a = 10; //localVariable
		Runnable runnable = () -> {
			b = 11;
			//a = 100;   final
			System.out.println(a);
		};
		runnable.run();
	}
}
