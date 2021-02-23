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
	private static final Random rd = new Random();

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newSingleThreadExecutor();

		List<Task> tasks = Arrays.asList(new Task(), new Task(), new Task(), new Task());
		List<Future<String>> futures = new ArrayList();
		for (Task task : tasks) {
			futures.add(executor.submit(task));
		}

		for (Future<String> future : futures) {
			System.out.println("future: " + future.get());
		}
		
		// cái trả về khi thực thi task
		Future<String> future = executor.submit(new Task());

		System.out.println("Value: " + future.get());
	}

	private static class Task implements Callable<String> {

		@Override
		public String call() throws Exception {
			TimeUnit.SECONDS.sleep(3);
			System.out.println(Thread.currentThread().getName() + "is running...");
			return stuffs[rd.nextInt(stuffs.length)];
		}

	}

}
