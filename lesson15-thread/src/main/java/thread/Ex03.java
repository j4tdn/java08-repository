package thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Ex03 {
	//private static volatile int counter = 2;
	
	private static AtomicInteger counter = new AtomicInteger();
	public static void main(String[] args) {
		
		System.out.println("thread main start");
		
		// expensive memory
		// do not know next execution task
		// cannot get data after execute task: void => ko the lay gia tri tra ve
		
		Thread t0 = new Thread(new Runnable() {
			
			public void run() {
				System.out.println("t0 is running...");
				//counter++;
				int x = counter.addAndGet(1);
				//System.out.println("t0 counter: " + counter);
				System.out.println("t0 counter: " + x);
			}
		}, "t0");
		t0.start();
		
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				System.out.println("t1 is running...");
				//counter*=2;
				System.out.println("t1 counter " + counter.addAndGet(4));
			}
		}, "t0");
		t1.start();
		
		System.out.println("thread main is running...");
		//counter += 2;
		System.out.println("main counter: " + counter.addAndGet(2));
		System.out.println("thread main end");
	}
}
