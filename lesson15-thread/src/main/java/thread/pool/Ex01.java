package thread.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex01 {
	public static void main(String[] args) {
		// thread pool
		ExecutorService executor = Executors.newFixedThreadPool(4);
		
		List<Task> tasks = new ArrayList<Task>();
		
		for (int i = 1; i <= 14; i++) {
			tasks.add(new Task());
		}
		
		for (Task task : tasks) {
			executor.execute(task);
		}
	}
	
	private static class Task implements Runnable {
		public void run() {
			System.out.println(Thread.currentThread().getName() + " is running...");
		}
	}
}
