package Thread;

import java.util.concurrent.TimeUnit;

public class Ex02 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("thread main start");
		
		//arc synchronized : bat dong bo
		// Multi-Thread : share data
		Thread t0 = new Thread("t0") {
			 @Override
			public void run() {
				 try {
					TimeUnit.SECONDS.sleep(3);
					System.out.println(Thread.currentThread().getName() + "is running ....");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		};
		t0.start();
		t0.join();
		
		System.out.println("thread main end");
	}
}
