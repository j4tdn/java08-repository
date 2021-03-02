package deadlock;

import java.util.concurrent.TimeUnit;

public class SuspendAndResumeDemo {
	private static Object sharedata = new Object();

	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread 1 has started...");
				synchronized (sharedata) {
					System.out.println("Thread 1 has obtained lock on >> shareData <<  ");
					System.out.println("Thread 1 has suspended");
					Thread.currentThread().suspend();

					System.out.println("Thread 1 has released >> shareData <<");
				}
				System.out.println("Thread 1 has ended...");
			}
		});

		thread1.start();
		// ensure thread1 start before thread2
		TimeUnit.SECONDS.sleep(2);

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread 2 has started...");
				
				thread1.resume();
				synchronized (sharedata) {
					System.out.println("Thread 2 has obtained lock on >> shareData <<  ");
					System.out.println("Thread 2 has released >> shareData <<");
				}
				System.out.println("Thread 2 has ended...");
			}
		});
		thread2.start();
	}

}