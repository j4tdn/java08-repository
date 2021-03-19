package thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Ex03VolatileWithLogger {

    //private static volatile int counter  = 2 ;
    // hoac dung Atomic ( trong do co volatile)
    private static AtomicInteger counter = new AtomicInteger(2);

    public static void main(String[] args) {
        System.out.println("Thread main start");

        Thread t0 = new Thread(new Runnable() {
            public void run() {
                System.out.println("t0 is running");

                System.out.println("t0 counter" +counter.addAndGet(1));
            }
        },"t0");
        t0.start();

        StringBuilder sb  = new StringBuilder();
        StringBuffer sbuff = new StringBuffer();


        Thread t1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("t1 is running");
                //counter *=2 ;
                System.out.println("t1 counter" +counter.addAndGet(4));
            }
        },"t1");
        t1.start();
        System.out.println("Thread main is running");
        //counter +=2 ;
        System.out.println("Main counter"+counter.addAndGet(2));
        System.out.println("Thread main end");
    }
}

// threads = CPU cores
//5000 tasks



// tai vi no co 3 stack
// han che của thread :
        // + ton tai nguyen expensive memory
        //  + do not know next execution task
        // + cannot get datas after executing task



// thread pool
