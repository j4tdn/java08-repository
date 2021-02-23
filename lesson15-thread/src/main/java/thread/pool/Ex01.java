package thread.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex01 {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(4);
	
		List<Task> tasks = new ArrayList<>();
		for (int i = 1; i <= 14; i++) {
			tasks.add(new Task());
		}
		
		for (Task task : tasks) {
			executor.execute(task);
		}
		executor.shutdown();
	}

	private static class Task implements Runnable {

		@Override
		public void run() {
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " is running");
		}
		
	}
}
