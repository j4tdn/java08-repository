package deadlock;

import java.util.Calendar;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class SuspendAndResumeDemo {
	
	private static Object sharedData = new Object();
	
	public static void main(String[] args) throws Exception {
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread 1 has started ...");
				synchronized (sharedData) {
					System.out.println("Thread 1 has obtained lock on >> sharedData << ");
					
					System.out.println("Thread 1 has suspended");
					Thread.currentThread().suspend();
					
					System.out.println("Thread 1 has released >> sharedData <<");
				}
				System.out.println("Thread 1 has ended ...");
			}
		});
		thread1.start();

		// ensure thread1 starts by thread2
		TimeUnit.SECONDS.sleep(2);
		
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread 2 has started ...");
				
				// wait thread
				synchronized (sharedData) {
					System.out.println("Thread 2 has obtained lock on >> sharedData << ");
					System.out.println("Thread 2 has released >> sharedData <<");
				}
				System.out.println("Thread 2 has ended ...");
			}
		});
		thread2.start();
		
		
	}
}
