package j4t_datatype;

public class Ex04ObjEx {
	public static void main(String[] args) {
		/*
		 * char c = '5'; System.out.println("isDigit : " + isDigit(c));
		 * System.out.println("isDigit : " + Character.isDigit(c));
		 */

		// Ex
		Integer a = 10;
		System.out.println("a :" + a);
		System.out.println("hash : " + System.identityHashCode(a));
		modified(a);
		System.out.println("a :" + a);
		System.out.println("hash : " + System.identityHashCode(a));
		System.out.println("==============");
		Integer x = new Integer(17);
		System.out.println("hash x : " + System.identityHashCode(x));
		Integer y = new Integer(22);
		System.out.println("hash y : " + System.identityHashCode(y));

		swap(x, y);
		System.out.println(x + "    :   " + y);
		System.out.println("hash x : " + System.identityHashCode(x));
		System.out.println("hash y : " + System.identityHashCode(y));

		// System.out.println(x.hashCode());

		// System.out.println(y.hashCode());

	}

	@SuppressWarnings("unused")
	private static boolean isDigit(char c) {
		return (c >= '0' && c <= '9');
	}

	private static void modified(Integer x) {
		x = 20;
	}

	private static void swap(Integer a, Integer b) {
		Integer tmp = a;
		a = b;
		b = tmp;
	}
}
