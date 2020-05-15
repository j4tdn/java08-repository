package random;

import java.util.Random;

public class Ex01Number {
	public static void main(String[] args) {
		Random rd = new Random();
		while (true) {
			//System.out.println(rd.nextInt(6));
			//System.out.println(22+ rd.nextInt(56-22 +1));//[22, 56]
			System.out.println(rd.nextInt(4));//[22, 56]
			sleep(1);
		}
	}

	private static void sleep(long seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
