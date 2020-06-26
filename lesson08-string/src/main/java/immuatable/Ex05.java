package immuatable;

import java.util.Calendar;

public class Ex05 {
	private static final int COUNT  = 1000000000;
	
	public static void main(String[] args) {
		//long start1 = Calendar.getInstance().getTimeInMillis(); midnghit: 1/1/1997 -> nay
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < COUNT; i++) {
			String l1 = "hello"; //o heap: 1, stack: 200000
			String l2 = "hello"; //ban chat van la tao doi tuong roi gan cho thuoc tinh, neu de constructor la private thi cung ko dc
			
//			String l1 = new String("hello");
//			String l2 = new String("hello");
		}
		System.out.println("duration: " + (System.currentTimeMillis() - start));
	}
}

//ko khai bao String object