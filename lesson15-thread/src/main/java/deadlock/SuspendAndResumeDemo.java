package deadlock;

import java.util.concurrent.TimeUnit;

public class SuspendAndResumeDemo {
	private static Object sharedData = new Object();

	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread 1 has started ...");
				synchronized (sharedData) {
					System.out.println("Thread 1 has obtained lock on >> share Data <<");
					System.out.println("Thread 1 has suspended");
					Thread.currentThread().suspend();

					System.out.println("Thread 1 has released >> share Data <<");
				}
			}
		});

		thread1.start();

		// Ensure thread 1 start by thread2
		TimeUnit.SECONDS.sleep(3);

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread 2 has started ...");
				thread1.resume();
				synchronized (sharedData) {
					System.out.println("Thread 2 has obtained lock on >> share Data <<");
					System.out.println("Thread 2 has suspended");
					Thread.currentThread().suspend();

					System.out.println("Thread 2 has released >> share Data <<");
				}
			}
		});

		thread2.start();

	}
}
