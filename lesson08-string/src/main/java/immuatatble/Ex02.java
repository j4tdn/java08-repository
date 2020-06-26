package immuatatble;

public class Ex02 {
	private static final int count = 1000000000;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			String l1 = "Hello";
			String l2 = "Hello";
		}
		System.out.println("duration: " + (System.currentTimeMillis() - start));

	}
}
