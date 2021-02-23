package thread;

import java.util.concurrent.TimeUnit;

public class Ex04 {
	
	private static long start = System.currentTimeMillis();
	
	
	public static void main(String[] args) {
		System.out.println(">> Thread main start<<");
		
		Thread t0=new Thread(new Task());
		Thread t1=new Thread(new Task());
		
		t0.start();
		t1.start();
		
		System.out.println(">> Thread main start<<");
		System.out.println("Thread main duration: "+(System.currentTimeMillis()-start));
	}

	private static class Task implements Runnable {

		public void run() {
			//query data takes 3 second
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " has ended.....");
			System.out.println(Thread.currentThread().getName()+" takes "+(System.currentTimeMillis()-start));
		}
	}
}