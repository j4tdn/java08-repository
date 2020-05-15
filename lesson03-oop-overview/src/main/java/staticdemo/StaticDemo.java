package staticdemo;

public class StaticDemo {
	public static void main(String[] args) {
		printf("hello");
	}
	
	private static void printf(String s) {
		System.out.println("Value: " + s);
	//	cout(s);
	}
	
	private void cout(String s) {
		System.out.println("Value: " + s);
		printf(s);
	}
}

// ham static dc khoi tao ngay khi chay chuong trinh o HEAP
// ham non-static chi dc khoi tao khi doi tuong dc khoi tao