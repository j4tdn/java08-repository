package immutable;

public class Ex01 {

	public static void main(String[] args) {
		// String literal
		String l1 = "Hello";
		String l2 = "Hello";
		System.out.println("isEquals VALUE: " + l1.equals(l2));
		System.out.println("== ADDRESS: " + (l1 == l2));

		System.out.println("==================================");

		// String object
		String o1 = new String("Welcome");
		String o2 = new String("Welcome");
		System.out.println("isEquals VALUE: " + o1.equals(o2));
		System.out.println("== ADDRESS: " + (l1 == o2));
	}

}
