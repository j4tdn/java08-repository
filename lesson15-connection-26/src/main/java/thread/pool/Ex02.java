package thread.pool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Ex02 {

    private static final String[] stuffs = {"laptop","pen","box","key"};

    private static Random rd = new Random();

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        List<Task> tasks = Arrays.asList(new Task(),new Task(),new Task(),new Task());
        List<Future> futures = new ArrayList<>();
        for(Task task : tasks){
            futures.add(executor.submit(new Task()));
        }

        for(Future<String> future : futures){
            System.out.println("future" + future.get());
        }

        // khi goi ham future.get() thi no se block thread chinh lai de khi nao ma doi tuong callable cua future do thuc hien xong va tra ket
        // qua thi moi mo block lai
        System.out.println("==============is running ...================");

    }

    private static class Task<String> implements Callable<String> {

        @Override
        public String call() throws Exception {
            System.out.println(Thread.currentThread().getName()+"is running");
            TimeUnit.SECONDS.sleep(3);
            return (String) stuffs[rd.nextInt(stuffs.length)];

        }
    }
}
