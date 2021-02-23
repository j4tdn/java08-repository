package thread;

import java.util.concurrent.TimeUnit;

public class Ex04 {
	public static void main(String[] args) {
		System.out.println(">>> Thread maub start <<<");
		
		Thread t0 = new Thread(new Task());
		Thread t1 = new Thread(new Task());
		
		
	}
	
	private static class Task implements Runnable {
		@Override
		public void run() {
			//query data takes 3 seconds
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
