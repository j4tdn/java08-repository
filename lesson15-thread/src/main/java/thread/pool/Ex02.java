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
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class Ex02 {
	
	private static final String[] stuffs = {"laptop", "pen", "box", "key"}; 
	private static final Random rd = new Random();
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		///ExecutorService executor = Executors.newSingleThreadExecutor();
		ExecutorService executor = Executors.newFixedThreadPool(2);
		List<Task> tasks = Arrays.asList(new Task(), new Task(), new Task(), new Task());
		List<Future<String>> futures = new ArrayList<>();
		
		FutureTask<String> firstTask = new FutureTask<>(new Task());
		//submit task in futureTask  -> do thread pool lam
		//return future in futureTask
		firstTask.get();
		
		for (Task task: tasks) {
			futures.add(executor.submit(task));
		}
		
		for (Future<String> future: futures) {
			System.out.println("future+ " + future.get());
		}
		
		// Dam bao lam xong het roi moi return value 
		Future<String> future = executor.submit(new Task());
		System.out.println("Value: " + future.get());
	}
	
	private static class Task implements Callable<String> {

		@Override
		public String call() throws Exception {
			System.out.println(Thread.currentThread().getName() + " is running");
			TimeUnit.SECONDS.sleep(3);
			//return ">> Welcome to our class";
			return stuffs[rd.nextInt(stuffs.length)];
		}
		
	}
}

// new thread 1 chay trc thi no se dua ptu thread 1 vao future truoc
// class Callable la 1 interface: truyen vao rong, return String
//   + giup return value sau khi thuc thi thread xong

// class Future: cai return ve sau khi Thread thuc thi Task
// Callable: la 1 Task thuc thi cho minh return ve Value
// FutureTask: 1 class chua 2 thong tin: Task nao can thuc thi, thuc thi xong goi ham tromg Future de return

