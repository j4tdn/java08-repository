package staticdemo;

public class StaticDemo {
	public static void main(String[] args) {
		printf("hello");
	}

	private static void printf(String s) {
		System.out.println("value : " + s);
	}

	private void cout(String s) {
		System.out.println("value : " + s);
		cout(s);
	}
}
