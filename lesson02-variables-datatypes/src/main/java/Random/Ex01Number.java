package Random;

import java.util.Random;

public class Ex01Number {

	public static void main(String[] args) throws InterruptedException {
		Random rd = new Random();
		
	
		while(true) {
			int a = rd.nextInt(10);
			System.out.println(a);
			sleep(1);
		}
	}
		
		private static void sleep(long seconds) throws InterruptedException {
			Thread.sleep(seconds *1000);
		}
	

}
