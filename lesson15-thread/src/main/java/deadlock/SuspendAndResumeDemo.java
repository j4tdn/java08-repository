package deadlock;

import java.util.concurrent.TimeUnit;

public class SuspendAndResumeDemo {
	private static Object sharedData = new Object();
	public static void main(String[] args) throws Exception {
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread1 has stated!");
				synchronized (sharedData) {
					System.out.println("thread1 has obtained lock on >> sharedData!!");
					System.out.println("thread1 has suspended!");
					Thread.currentThread().suspend();
					System.out.println("thread1 has released sharedData");
				}
				System.out.println("thread1 has ended");
				
			}
		});
		thread1.start();
		
		TimeUnit.SECONDS.sleep(2);
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread2 has stated!");
				thread1.resume();
				synchronized (sharedData) {
					System.out.println("thread2 has obtained lock on >> sharedData!!");
					
					System.out.println("thread2 has released sharedData");
				}
				System.out.println("thread2 has ended");
				
				
			}
		});
		thread2.start();
	}

}
