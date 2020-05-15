package j4t.datatype;

public class Ex04ObjectEx {

	public static void main(String[] args) {
		/*
		 * char c = '5'; System.out.println("isDigit:" + isDigit(c));
		 * System.out.println("isDigit:" + Character.isDigit(c));
		 */

		// Ex
		Integer a = new Integer(10);
		System.out.println("a:" + a);
		System.out.println("a hashcode:"+ System.identityHashCode(a));
		modified(a);
		System.out.println("a:" + a);
		System.out.println("a1 hashcode:"+ System.identityHashCode(a));

		System.out.println("==================");
		
		Integer x = new Integer(17);
		Integer y = new Integer(22);
		swap(x, y);
		System.out.println("x:" + x);
		System.out.println("x hashcode:"+ System.identityHashCode(x));
		System.out.println("y:" + y);
		System.out.println("y hashcode:"+ System.identityHashCode(y));

	}

	private static void modified(Integer a) {
		a = 20;
	}

	@SuppressWarnings("unused")
	private static boolean isDigit(char c) {
		return (c >= '0' && c <= '9');

	}

	private static void swap(Integer a, Integer b) {
		Integer tmp = a;
		a = b;
		b = tmp;

	}

}
