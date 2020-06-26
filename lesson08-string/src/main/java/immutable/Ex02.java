package immutable;

public class Ex02 {
	private static final int COUNT=100000000;
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		//long end = Calendar.getInstance().getTimeInMillis(); //1/1/1970
		for(int i=0;i<COUNT;i++) {
			String l1 = "Hello";
			String l2 = "Hello";
		}
		System.out.println(System.currentTimeMillis()-start);
		
	}
}
