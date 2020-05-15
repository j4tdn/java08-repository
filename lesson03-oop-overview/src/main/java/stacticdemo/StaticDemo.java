package stacticdemo;

public class StaticDemo {
	public static void main(String[] args) {
		StaticDemo s = new StaticDemo();
		s.cout("Heloo");
		printf("Hello");

	}
	
	private static void printf(String s) {
		System.out.println("Value: "+ s);
		//cout(s);
	}
	
	private void cout(String s) {
		System.out.println("Value: "+ s);
		printf(s);
	}
}
