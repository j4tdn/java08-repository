package thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ex03VolatileWithLogger {
	private static Logger LOG = LoggerFactory.getLogger(Ex03VolatileWithLogger.class);
	private static volatile int counter = 2;
	
	public static void main(String[] args) {
		LOG.debug("t0 counter log: " + counter);
		System.out.println("xx: " + LOG.getName());
		
		System.out.println("Thread main start");
		
		// expensive memory
		// do not know next execution task
		// cannot get data after execute task
		Thread t0 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// System.out.println
				System.out.println("t0 is running ...");
				counter++;
				System.out.println("t0 counter: " + counter);
			}
		}, "t0");
		t0.start();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("t1 is running ...");
				counter*=2;
				System.out.println("t1 counter: " + counter);
			}
		}, "t1");
		t1.start();
		
		System.out.println("Thread main is running ...");
		counter += 2;
		System.out.println("main counter: " + counter);
		System.out.println("Thread main end");
	}
}
