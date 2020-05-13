package cuong.datatype;

public class Ex04ObjectEx {

	public static void main(String[] args) {
		/*
		 * char c = 'x'; System.out.println(isDigit(c));
		 * System.out.println(Character.isDigit(c));
		 */

		// Ex
		Integer a = new Integer(10);
		System.out.println("a: " + a);
		System.out.println("a system hashcode: " + System.identityHashCode(a));
		modified(a);
		System.out.println("a: " + a);
		
		System.out.println("------------------------------------");
		Integer x = new Integer(17);
		Integer y = new Integer(22);
		swap(x, y);
		System.out.println(x);
		System.out.println(y);
	}

	@SuppressWarnings("unused")
	private static boolean isDigit(char c) {
		return (c >= '0' && c <= '9');
	}

	private static void modified(Integer x) {
		System.out.println("x1 system hashcode: " + System.identityHashCode(x));
		x = 20;
		System.out.println("x2 system hashcode: " + System.identityHashCode(x));
	}
	
	private static void swap(Integer a, Integer b) {
		Integer temp = a;
		a = b;
		b = temp;
	}
}
