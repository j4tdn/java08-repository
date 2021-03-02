package deadlock;

import java.util.concurrent.TimeUnit;

public class SuspendAndResumeDemo {
	
	private static Object shareData=new Object();
	
	public static void main(String[] args)throws Exception {
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread 1 has startd: ");
				synchronized (shareData) {
					System.out.println("Thread 1 has obtained lock on >> shareData <<");
					
					System.out.println("Thread 1 has suspended");
					Thread.currentThread().suspend();
					
					System.out.println("Thread 1 has released >> shareData <<");
				}
				System.out.println("Thread 1 has ended");
			}
		});
		thread1.start();
		
		//ensure thread1 start by thread2 
		TimeUnit.SECONDS.sleep(3);
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread 2 has startd: ");
				thread1.resume();
				synchronized (shareData) {
					System.out.println("Thread 2 has obtained lock on >> shareData <<");
					
					System.out.println("thread 2 has released >> shareData <<");
				}
				System.out.println("Thread 2 has ended");

			}
		});
		thread2.start();
	}
}
