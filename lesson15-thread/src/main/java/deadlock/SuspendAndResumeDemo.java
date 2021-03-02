package deadlock;

import java.util.concurrent.TimeUnit;

public class SuspendAndResumeDemo {
	private static Object shareData = new Object();

	public static void main(String[] args) throws Exception {
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread1 had started ...");
				
				
				synchronized (shareData) {
					System.out.println("Thread1 has obtained lock on >> shareData <<");
					System.out.println("Thread1 has suspended");
					Thread.currentThread().suspend();
					System.out.println("Thread1 has release >> shareData <<");
				}
				System.out.println("Thread1 has ended ...");
			}
		});
		thread1.start();
		TimeUnit.SECONDS.sleep(2);

		// make thread1 starts by thread2
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread2 had started ...");
				synchronized (shareData) {
					System.out.println("Thread2 has obtained lock on >> shareData <<");
					
					System.out.println("Thread2 has release >> shareData <<");
				}
				System.out.println("Thread2 has ended ...");
			}
		});
		thread2.start();
	}
}
