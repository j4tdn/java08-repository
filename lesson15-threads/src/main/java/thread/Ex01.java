package thread;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("Thread main start");

		// Thread#start->check state ->thread#run ->runnable#run
		Thread t0 = new Thread(new Runnable() {// thread co nv thuc thi task

			public void run() {
				// task
				System.out.println(Thread.currentThread().getName() + " is running....");

			}
		}, "t0");
		t0.start();

		int i = 0;

		while (true) {
			if (i == 100000) {
				System.out.println("Thread main end");
				break;
			}
			i++;
		}

	}
}
