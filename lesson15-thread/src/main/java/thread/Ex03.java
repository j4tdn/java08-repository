package thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Ex03 {

	//private static volatile int counter = 2; // volatile 
	
	private static AtomicInteger counter = new AtomicInteger(2);

	public static void main(String[] args) {

		System.out.println("Thread main start");

		Thread t0 = new Thread(new Runnable() {

			public void run() {
				System.out.println(Thread.currentThread().getName() + " is running ...");
				
				System.out.println("t0 Counter:"+ counter.addAndGet(1));
			}
		}, "t0");

		t0.start();

		Thread t1 = new Thread(new Runnable() {

			public void run() {
				System.out.println(Thread.currentThread().getName() + " is running ...");
				System.out.println("t1 Counter:"+ counter.addAndGet(4));

			}
		}, "t1");
		t1.start();
		
		
		
		System.out.println("Thread main is running ...");
		System.out.println("Main Counter: "+ counter.addAndGet(2));
		System.out.println("Thread main end.");
	}
}
