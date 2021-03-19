package thread.pool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Ex03 {

    private static final ExecutorService executor = Executors.newFixedThreadPool(4);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Q1 : List<String>
        // O2 : List<Integer>



        FutureTask<List<String>> stringTask = new FutureTask<>(() -> Arrays.asList("hello","hi","hihi"));

        FutureTask<List<Integer>> integerTask = new FutureTask<>(() -> Arrays.asList(1,2,3,4));


        // run tasks
        // muc dich la chay xong roi tra ve 2 ket qua khac nhau
        runTasks(Arrays.asList(stringTask,integerTask));


        //crob job , quart job 

        List<String> stringResult = stringTask.get();
        List<Integer> integerResult = integerTask.get();

        System.out.println("String size" + stringResult.size());
        System.out.println("Integer size " + integerResult.size());
    }

    private static void runTasks(List<FutureTask<?>> tasks){
        tasks.forEach(task -> runTask(task));
    }

    private static void runTask(FutureTask<?> task){
        executor.submit(task);
    }


}
