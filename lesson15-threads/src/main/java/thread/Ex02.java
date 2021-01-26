package thread;

import java.util.concurrent.TimeUnit;

public class Ex02 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Thread main start");

		//arc synchronized : bat dong bo
		Thread t0 = new Thread("t0") {

			public void run() {
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " is running.....");
			};
		};
		t0.start();
		t0.join();//chay xong thang khac moi chay
		
		System.out.println("Thread main end");

	}

}
