package lambda;

public class LocalVariable {
	private int b = 100;

	public static void main(String[] args) {

	}

	private void test() {
		// local variable
		final int a = 10;
		Runnable runnable = () -> {
//			a = 15;
			System.out.println(a);
			b = 10;
			System.out.println(b);
		};

		runnable.run();
	}
}
