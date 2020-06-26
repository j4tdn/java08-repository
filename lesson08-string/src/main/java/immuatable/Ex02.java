package immuatable;

public class Ex02 {

	private static final int count = 1000000000;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			String s1 = "hello";
			String s2= "hello";
		}
		System.out.println("duration:" + (System.currentTimeMillis()-start));
	}

}
