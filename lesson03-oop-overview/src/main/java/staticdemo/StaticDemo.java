package staticdemo;

public class StaticDemo {
	
	public static void main(String[] args) {
		printtf("Hello");
		
	}

	private static void printtf(String s) {
		System.out.println("Value : " +s);
		//cout(s);
	}
	
	private  void cout(String s) {
		System.out.println("Value : " +s);
		printtf(s);
		
	}
}

//thuoc tinh phuong thuc nónstatic