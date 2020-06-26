package immutable;

public class Ex02 {
	
	private static final int COUNT = 1000000000;
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();		
		for (int i = 0; i < COUNT; i++) {
//			String l1 = new String("hello");
//			String l2 = new String("hello");
			String l1 = "hello";
			String l2 = "hello";
		}
		
		System.out.println("duration: " + (System.currentTimeMillis() - start));
	}
}
