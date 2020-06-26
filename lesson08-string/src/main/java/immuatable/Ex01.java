package immuatable;

public class Ex01 {
	public static void main(String[] args) {

		// String literal
		String l1 = "hello";
		String l2 = "hello";
		System.out.println("isEquals VALUE: " + l1.equals(l2));
		System.out.println("isEquals ADDRESS: " + l1 == l2);

		// String object
		String o1 = new String("welcome");
		String o2 = new String("welcome");
		o2 = new String("hello");
		System.out.println("isEquals VALUE: " + o1.equals(o2));
		System.out.println("isEquals ADDRESS: " + o1 == o2);

	}
}
