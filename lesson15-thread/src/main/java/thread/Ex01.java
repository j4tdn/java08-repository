package thread;

public class Ex01 {
	public static void main(String[] args) { //main: 1 thread
		System.out.println("Thread main start");
		
		//thread#start => check state => Thread#run => Runnable#run
		Thread t0 = new Thread(new Runnable() { //t0: reciever   //runnable
			
			public void run() {
				System.out.println(Thread.currentThread().getName() + " is running...");
			}
		}, "t0");
		
		t0.start(); //JVM nhay sang
		
		int i = 0;
		while(true) {
			if (i == 10000) {
				System.out.println("thread main end");
				//break;
			}
			i++;
		}
	}
}
