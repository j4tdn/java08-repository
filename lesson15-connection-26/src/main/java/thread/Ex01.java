package thread;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("Thread main start");

        // thread # start => check state => thread #run => runnable #run



        // state : new
        Thread t0 = new Thread(new Runnable() {
            public void run() {
                System.out.println("t0 is running");
            }
        },"t0");
        t0.start();

//        int i = 0;
//        while(true){
//            i
//        }


        System.out.println("Thread main end");
    }
}
