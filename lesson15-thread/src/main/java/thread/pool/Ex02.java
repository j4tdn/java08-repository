package thread.pool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Ex02 {

	private static final String[] stuffs = { "laptop", "pen", "box", "key" };
	private static Random rd = new Random();

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		List<Task> tasks = Arrays.asList(new Task(), new Task(), new Task(), new Task());
		List<Future> futures = new ArrayList<Future>();
		
		for (Task task : tasks) {
			futures.add(executor.submit(task));
		}

		for (Future<String> future : futures) {
			System.out.println("Value: " + future.get());
		}

	}

	private static class Task implements Callable<String> {

		public String call() throws Exception {
			System.out.println(Thread.currentThread().getName()+" is running");
			TimeUnit.SECONDS.sleep(3);
			return stuffs[rd.nextInt(stuffs.length)];
		}

	}
}
