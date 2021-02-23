package thread.pool;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Ex03 {
	private static ExecutorService executor;
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//Q1: return List<String>
		//Q2: return List<Integer>
		ExecutorService executor = Executors.newFixedThreadPool(4);
		
		//create tasks
		FutureTask<List<String>> stringTask = new FutureTask<List<String>>(
			() -> Arrays.asList("key","box","board"));
		
		
		FutureTask<List<Integer>> integerTask = new FutureTask<List<Integer>>(
				() -> Arrays.asList(12,24,36));
		//run tasks
		runTasks(Arrays.asList(stringTask, integerTask));
		//get result from future
		
		List<String> stringResult = stringTask.get();
		List<Integer> integerResult = integerTask.get();
		System.out.println("String size"+ stringResult.size());
		System.out.println("Integer size"+ integerResult.size());
	}
	
	private static void runTasks(List<FutureTask<?>> tasks) {
		tasks.forEach(task -> runTask(task));
	}
	
	private static Future<?> runTask(FutureTask<?> task) {
		return executor.submit(new Runnable() {
			
			@Override
			public void run() {
				task.run();
				
			}
		});
	}
}
