package thread.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex01 {
	public static void main(String[] args) {
		// threadpool
		ExecutorService excutor = Executors.newFixedThreadPool(4);
		List<Task> tasks = new ArrayList<Ex01.Task>();
		for (int i = 1; i <= 14; i++) {
			tasks.add(new Task());
		}
		for (Task task : tasks) {
			excutor.execute(task);
		}
		excutor.shutdown();
	}

	private static class Task implements Runnable {

		public void run() {
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " i running");
		}

	}
}
