package lambda;

public class LocalVariable {
	// - anonymous class = anonymous function = lamda: using global var (attribute) with no restriction
	// 													using local var: required final for local var
	private int b = 20;

	public static void main(String[] args) {

	}

	private void test() {
		// local variable
		final int a = 10;
		Runnable runnable = () -> {
			//a = 100;
			System.out.println(a);

			b = 10;
			System.out.println(b);
		};
		runnable.run();
	}

}
