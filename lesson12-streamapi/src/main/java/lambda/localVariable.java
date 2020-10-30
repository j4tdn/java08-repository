package lambda;

// anonymous class = anonymous function = lambda
// using global var ( attribute ) with no restriction
// using local var : require final for local var.

public class localVariable {
	private int b = 10;

	public static void main(String[] args) {

	}

	private void test() {
		// local variable
		// final
		final int a = 10;
		Runnable runnable = () -> {
//			a = 1;
			b = 1;
			System.out.println(a);
			System.out.println(b);
		};
		runnable.run();
	}
}
