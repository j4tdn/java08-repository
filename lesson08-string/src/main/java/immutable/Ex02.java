package immutable;

public class Ex02 {
	private static final int COUNT = 100000000;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println(start);
		for (int i = 0; i < COUNT; i++) {
			String l1 = new String( "Hello");
			String l2 = new String ("Hello");
		}
		
		System.out.println(System.currentTimeMillis());		
		System.out.println("Duration: " + (System.currentTimeMillis() - start));
	}
}
