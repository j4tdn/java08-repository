package mutable;

import java.text.NumberFormat;

public class StringBuilderMulThreadDemo implements Runnable{
	StringBuffer stringMutable;

    public StringBuilderMulThreadDemo() {
        stringMutable = new StringBuffer();
    }

  
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
            addChar();
        }
    }

    public void addChar() {
        /*
         * Here appended 6 A and removed 5 A at each call to this method. Total
         * 1 A at each call Expected Accurate Total StringBuilder length = loops
         * in run method * 1 i.e. 50000 * 1 for one thread Here we have 2
         * threads so = 100000
         */

        try {
            stringMutable.append("T");
            stringMutable.append("T");
            stringMutable.append("T");
            stringMutable.append("T");
            stringMutable.append("T");
            stringMutable.append("T");
            for (int i = 0; i < 5; i++) {
                stringMutable.deleteCharAt(0);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("A wasn't at index 0 " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        StringBuilderMulThreadDemo process = new StringBuilderMulThreadDemo();

        
        Thread threadOne = new Thread(process, "Thread One");
        Thread threadTwo = new Thread(process, "Thread Two");
        threadOne.start();
        threadTwo.start();

        
        try {
            // join to one main process
            threadOne.join();
            threadTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         

        System.out.println("Final StringBuilder Length: " + NumberFormat.getNumberInstance().format(process.stringMutable.length()));

    }

}
