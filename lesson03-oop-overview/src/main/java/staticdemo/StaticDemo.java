package staticdemo;

public class StaticDemo {
	public static void main(String[] args) {
		print("HELLO");
	}
	
	private static void print(String s) {
		System.out.println("Value: " + s);
	}
	
	private void cout(String s) {
		System.out.println("Value: " + s);
		print(s);
	}
}
