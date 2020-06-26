package immuatatble;

public class Ex01 {
	public static void main(String[] args) {
		// String literal
		String l1 = "Hello";
		String l2 = "Hello";
		System.out.println("isEquals VALUE: " + l1.equals(l2)); // so sanh == chi o stack
		System.out.println("== ADDRESS: " + (l1 == l2));

		// String object
		String o1 = new String("Wellcome");
		String o2 = new String("Wellcome");
		System.out.println("isEquals VALUE: " + o1.equals(o2));
		System.out.println("== ADDRESS: " + (o1 == o2));
		o2 = "to";
		System.out.println(o2);
	}

}
