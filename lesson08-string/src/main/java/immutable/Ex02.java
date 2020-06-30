package immutable;

public class Ex02 {
	private static final int COUNT = 1000000000;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < COUNT ; i++) {
			String l1 = "hello";
			String l2 = "hello";
//			String o1 = new String("welcome");
//			String o2 = new String("welcome");
		}
		System.out.println("duration: " + (System.currentTimeMillis() - start));
		


	}

}
