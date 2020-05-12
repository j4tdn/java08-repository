package random;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		Random rd = new Random();
		while(true) {
			System.out.println(rd.nextInt(10));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
