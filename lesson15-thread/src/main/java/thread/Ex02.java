package thread;

import java.util.concurrent.TimeUnit;

public class Ex02 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Thread main start");
		
		//arc synchronized: bat dong bo
		Thread t0 = new Thread("t0") { //anonymous class
			public void run() {
				try {
					TimeUnit.SECONDS.sleep(3);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " is running....");
			}
		};
		t0.start();
		t0.join(); //t0 chay xong/chay trong 1 khoang thoi gian nao do (tham so truyen vao) nhung ham khac moi chay
		
		System.out.println("Thread main end");
	}
}
