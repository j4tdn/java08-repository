package lambda;

//anonymous class =  anonymous function = lambda
// using global var (attribute) with no restriction
// using local var required final for local var
public class LocalVariable {
	private int b = 100;
	public static void main(String[] args) {
		
	}
	
	private void test() {
		//local variable
		final int a = 10;
		Runnable runnable = () -> {
			System.err.println(a);
			b = 11;
			System.out.println(b);
		};
		
		runnable.run();
	}

}
