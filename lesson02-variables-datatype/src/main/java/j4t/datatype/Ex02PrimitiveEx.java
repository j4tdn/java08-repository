package j4t.datatype;

public class Ex02PrimitiveEx {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a: " + a);
		modified(a);
		System.out.println("a: " + a);
		
		System.out.println("------------------------------");
		
	}
	
	private static int modified(int a) {
		return a = 20;
	}
}
