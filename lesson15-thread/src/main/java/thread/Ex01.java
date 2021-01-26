package thread;

public class Ex01 {
	public static void main(String[] args) {
		int i=0;
		
		System.out.println("Thread main start");
		Thread t0=new Thread(new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName()+" "+"t0 is running ...");
			}
		},"t0");
		t0.start();//de quan ly vong doi
					// con t0.run() laf 1 phuong thuc neen k dung run()
		
		while(true) {
			if(i==10000000) {
				System.out.println("Thread main end");
				break;
			}
			i++;
		}
		
	}
}
