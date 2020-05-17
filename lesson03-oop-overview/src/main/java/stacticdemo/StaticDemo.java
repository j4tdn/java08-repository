package stacticdemo;

public class StaticDemo {
	public static void main(String[] args) {
	   printf("hello");
             
	}
	private static void printf(String s) {
		System.out.println("value:"+s);
		//unt(s);
	}
	
	private void Count(String s) {
		System.out.println("value:"+s);
		printf(s);
	}
}
