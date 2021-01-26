package thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Ex03 {
	// private static volatile int counter = 2;

	private static AtomicInteger counter = new AtomicInteger(2);
	public static void main(String[] args) {
		System.out.println("Thread main start");

		// expensive memory
		// do not know next execution task
		// cannot get data after execute task
		Thread t0 = new Thread(new Runnable() {
			public void run() {
				System.out.println("t0 is running");
				System.out.println("t0 counter " + counter.addAndGet(1));
			}
		}, "t0");
		t0.start();

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				System.out.println("t1 is running");
				System.out.println("t1 counter " + counter.addAndGet(4));
			}
		}, "t1");
		t1.start();

		System.out.println("Thread main is running...");
		System.out.println("main counter " + counter.addAndGet(2));
		System.out.println("Thread main end");
	}
}
