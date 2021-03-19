package deadlock;

import java.util.concurrent.TimeUnit;

public class SuspendAndResumeDemo {

    private static Object sharedDta = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 is running");

                synchronized (sharedDta){
                    System.out.println("Thread 1 has obtained lock on shared data");
                    System.out.println("Thread 1 has suspended");
                    Thread.currentThread().suspend();
                    Thread.currentThread().resume();

                    System.out.println("Thread 1 has released >> shared Data  << ");
                }
                System.out.println("Thread 1 has ended");
            }

        });

        // ensure thread 1 starts by thread 2
        thread1.start();
        TimeUnit.SECONDS.sleep(2);

        Thread thread2 = new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Thread 2 is running");
                synchronized (sharedDta){
                    System.out.println("Thread 2 has obtained lock on shared data");
                    System.out.println("Thread 2 has suspended");
                    Thread.currentThread().suspend();

                    System.out.println("Thread 1 has released >> shared Data  << ");
                }
                System.out.println("Thread 2 has ended");
            }
        });
        thread2.start();
    }



}
