package deadlock;

import java.util.concurrent.TimeUnit;

public class SuspendAndResumeDemo {
	
	private static Object shareData = new Object(); //data dung chung
	
	public static void main(String[] args) throws Exception {
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("thread 1 has started...");
				synchronized ("shareData") {
					System.out.println("Thread 1 has obtained lock on >> shareData <<");
					
					System.out.println("Thread 1 has suspened");
					Thread.currentThread().suspend();
					
					System.out.println("Thread 1 has released >> shareData <<");
				}
				
				System.out.println("Thread 1 has ended");
			}
		});
		thread1.start();
		
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("thread 2 has started...");
				
				thread1.resume(); //tiep tuc, noi lai
				synchronized ("shareData") { //Object.class
					System.out.println("Thread 2 has obtained lock on  >> shareData <<");
					
					System.out.println("Thread 2 has released >> shareData <<");
				}
				
				System.out.println("Thread 2 has ended");
			}
		});
		thread2.start();
		
		//ensure thread1 start by thread2
		TimeUnit.SECONDS.sleep(2);
	}
	
}

