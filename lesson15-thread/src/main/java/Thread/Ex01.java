package Thread;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("thread main start");
		//Thread#start => check state => thread#run => runnable#run
		Thread t0 = new Thread(new Runnable() {

			public void run() {
				System.out.println(Thread.currentThread().getName() + "t0 is running....");
			}
		}, "t0");
		t0.start();// de quan ly state cua thread
		int i = 0;
        while(true) {
        	if(i == 10000000) {
        		System.out.println("thread main end");
        		break;
        	}
        	
        	i++;
        }
		
	}
}
