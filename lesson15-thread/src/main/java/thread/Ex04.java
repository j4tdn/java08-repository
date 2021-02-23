package thread;

import java.util.concurrent.TimeUnit;

public class Ex04 {
	
	private static long start = System.currentTimeMillis();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(">>> Thread main start <<<");

		Thread t0 = new Thread(new Task());
		Thread t1 = new Thread(new Task());

		t0.start();
		t1.start();

		System.out.println(">>> Thread main end <<<");
		System.out.println("Thread main duration: " + (System.currentTimeMillis() - start));
	}

	private static class Task implements Runnable {

		public void run() {
			// query data take 3 seconds
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName() + "has ended ...");
			System.out.println(Thread.currentThread().getName() + "takes " + (System.currentTimeMillis() - start));
		}

	}

}
