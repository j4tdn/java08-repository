package immuatable;

import java.util.Calendar;

public class Ex02 {
	
	private static final int COUNT = 1000000000;
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();// tu 1 thang 1 den 1970 den hien nay ;
		
		for(int i = 0 ; i< COUNT; i++) {
			//String l1 = "hello";  bản chất của nó cũng dùng từ new String (... ) ;
			//String l2 = "hello";
			
			String o1 = new String("wellcome");
			String o2 = new String("wellcome");
		}
		
		System.out.println("Duration :" + (System.currentTimeMillis()-start));
		
		
		
		
		
	}
}
