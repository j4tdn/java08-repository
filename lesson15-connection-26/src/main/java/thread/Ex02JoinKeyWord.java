package thread;

import java.util.concurrent.TimeUnit;

public class Ex02JoinKeyWord {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread main start");


        // arc synchronized : bat dong bo

        // Multiple thread : share data

        Thread t0 = new Thread("t0"){
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" is running");
            }
        };

        t0.start();
        // bat buoc t0 phai chay xong roi current thread moi chay duoc
        t0.join();

        System.out.println("Thread main end");
    }
}
