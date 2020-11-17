package immuatable;

public class Ex01 {
	public static void main(String[] args) {
		// String literal
		String l1 = "hello";
		String l2 = "hello";
		System.out.println("isEquals VALUE: " + l1.equals(l2)); // T
		System.out.println("== ADDRESS: " + (l1 == l2)); // T
		
		System.out.println("================================");
		
		// String object
		String o1 = new String("welcome");
		String o2 = new String("welcome");
		o2 = "to";
		System.out.println("isEquals VALUE: " + o1.equals(o2)); // T
		System.out.println("== ADDRESS: " + (o1 == o2)); // F
		
		
		
	}
}
