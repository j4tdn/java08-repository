package lambda;

// anonymous class = anonymous function  = lambda
// using global var(attribute) with no restriction
// using local var : require final for local var

public class LocalVariable {
	private int b = 20;

	public static void main(String[] args) {

	}

	private void test() {
		// local variable
		int a = 10;
		Runnable runnable = () -> {
			// ko the thay doi gia tri cua a, chi co the goi a
			//a = 100;
			System.out.println(a);

			b = 10;
			System.out.println(b);

		};
		runnable.run();
	}
}
