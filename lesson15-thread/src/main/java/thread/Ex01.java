package thread;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("Thread main start");

		//Thread#start => check state => Thread#run => Runnable#run
		Thread t0 = new Thread(new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName() + " is running..."); // lấy tên thread đang chạy
																							// hiện tại
			}
		}, "t0");
		t0.start();

		int i = 0;
		while (true) {
			if (i == 100000000) {
				System.out.println("Thread main end");
				break;
			}
			i++;

		}

	}
}
