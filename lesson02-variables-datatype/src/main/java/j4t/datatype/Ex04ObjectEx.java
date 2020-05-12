package j4t.datatype;

public class Ex04ObjectEx {
	public static void main(String[] args) {
		/*
		 * char c = 'x'; System.out.println(isDigit(c));
		 * System.out.println(Character.isDigit(c));
		 */
	 
		
		int a = 10;
		System.identityHashCode(a);

		System.out.println("a: " + a);
		modified(a);
		System.out.println("a: " + a);
		
		System.out.println("------------------------------");
		Integer  x = 5;
		Integer  y = 10;
		
		System.out.println(System.identityHashCode(x));
		modified(x);
		
		System.out.println(System.identityHashCode(x));


		
	}
	
	private static boolean isDigit(Character c) {
		return (c>='0' && c <='9');
	}
	

	
	private static int modified(int a) {
		return a = 20;
	}
	
	private static void swap(Integer a, Integer b) {
		Integer tmp = a;
		a = b ;
		b = tmp;
		
	}
}
