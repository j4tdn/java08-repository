package staticdemo;

public class StaticDemo {
	public static void main(String[] args) { //main dc khoi tao trong heap
		printf("Hello");
	}
	
	// tao khi doi tuong dc tao ra
	private static void printf(String s) { //ham thuoc pham vi doi tuong, non-static ko dc goi trong static
		System.out.println("Value: " + s);
		//cout(s); //vi cout thuoc doi tuong dc khoi tao sau
	}
	
	private void cout(String s) { //non-static co the goi static
		System.out.println("Value: " + s);
		printf(s);
	}
}
