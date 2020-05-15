package random;

import java.util.Random;

public class Ex01Number {
	public static void main(String[] args) throws InterruptedException {
		Random random = new Random();

		while (true) {
			// 22 -56
			int number = 22 + random.nextInt(56 - 22 + 1);
			System.out.println(number);
			sleep(1);
		}
	}

	private static void sleep(long i) throws InterruptedException {
		Thread.sleep(i * 1000);
	}
}
