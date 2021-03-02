package deadlock;

import java.util.concurrent.TimeUnit;

public class SuspenAndResumeDemo {
	private static Object sharedata = new Object();

	// singerton tai mot thoi diem class co 1 doi tuong duy nhat
	// class lam singerton
	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("thread1 has started");
				synchronized (sharedata) {
					System.out.println("thread 1 has obtained lock on >> shareData <<");
					System.out.println("Thread1 has suspened");
					Thread.currentThread().suspend();
					System.out.println("thread1 has release >> shareData <<");
				}
				System.out.println("thread1 has ened...");
			}

		});

		thread1.start();
		// ensure thread1 start before thread2
		TimeUnit.SECONDS.sleep(2);

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("thread2 has started");
				thread1.resume();
				synchronized (sharedata) {
					System.out.println("thread 2 has obtained lock on >> shareData <<");
					System.out.println("Thread2 has suspened");
					Thread.currentThread().suspend();
					System.out.println("thread 2 has release >> shareData <<");
				}
				System.out.println("thread 2 has ened...");
			}
		});
		thread2.start();
	}
// process va thread: co nhieu thread dung chung 1 tien trinh va su dung chung tien trinh do		
}
