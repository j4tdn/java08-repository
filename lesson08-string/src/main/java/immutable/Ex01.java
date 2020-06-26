package immutable;

public class Ex01 {
	public static void main(String[] args) {
		// String literal
		String l1 = "Hello";
		String l2 = "Hello";
		System.out.println("isEqual VALUE: " + l1.equals(l2));
		System.out.println("== ADDRESS: " + (l2 == l1));

		System.out.println("========================================");
		// String object
		String o1 = new String("Welcome");
		String o2 = new String("Welcome");
		System.out.println("isEqual VALUE: " + o1.equals(o2));
		System.out.println("== ADDRESS: " + (o2 == o1));
	}
}
