package lambda;

// using global variable (attribute) with no restriction
// using local variable with

public class LocalVariable {

	private int b;

	public static void main(String[] args) {

	}

	private void test() {
		// local variable
		int a = 10;
		Runnable runnable = () -> {
			// a = 10;
			System.out.println(a);

			b = 10;
			System.out.println(b);
		};
		runnable.run();
	}
}
