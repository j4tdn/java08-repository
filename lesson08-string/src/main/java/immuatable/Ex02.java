package immuatable;

import java.util.Calendar;

public class Ex02 {
	private static final int count = 1000000000;

	public static void main(String[] args) {
		// tao ra 200 nghin o nho
//		long start = Calendar.getInstance().getTimeInMillis();// lay moc tu 1970
		long start = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			String l1 = "hello";
			String l2 = "hello";
		}

		System.out.println("duration :" + (System.currentTimeMillis() - start));
	}
}
