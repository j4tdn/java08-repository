package threadpool;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Ex03 {
	
	private static ExecutorService executor;
	static {
		executor = Executors.newFixedThreadPool(4);
	}
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// Q1: return List<String>
		// Q2: return List<Integer>
		
		ExecutorService executor = Executors.newFixedThreadPool(4);
		FutureTask<List<String>> stringtask = new FutureTask<List<String>>
		(() -> Arrays.asList("key","box","board"));
		
		FutureTask<List<Integer>> integertask = new FutureTask<List<Integer>>
		(() -> Arrays.asList(12, 24, 36, 25, 89));
		
		runTasks(Arrays.asList(stringtask, integertask));
		
		List<String> stringResult=stringtask.get();
		List<Integer> integerResult=integertask.get();
		System.out.println("string size: "+stringResult.size());
		System.out.println("integer size: "+integerResult.size());

	}
	
	private static void runTasks(List<FutureTask<?>> tasks) {
		tasks.forEach(task -> runTasks(task));
	}
	private static Future<?> runTasks(FutureTask<?> task) {
		return executor.submit(new Runnable() {
			
			@Override
			public void run() {
				task.run();
			}
		});
	}
}
