package thread;

import java.util.concurrent.TimeUnit;

public class Ex02 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Thread main start");
		
		// arc synchronized: bất đồng bộ
		// multi-thread: shared memory
		Thread t0 = new Thread("t0") {
			public void run() {
				try {
					TimeUnit.SECONDS.sleep(3);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " is running ...");
			};
		};
		t0.start();
		t0.join();
		
		System.out.println("Thread main end");
	}
}
