package immutable;

public class Ex01 {
	public static void main(String[] args) {
		// String literal -> gan value cho object -> constant pool
		// String object -> new object
		
		String l1 = "hello";
		String l2 = "hello";
		System.out.println("isEquals VALUE: " + l1.equals(l2));
		System.out.println("== ADDRESS: " + (l1 == l2));		
		
		System.out.println("\n=====================\n");
		
		String o1 = new String("Welcome");
		String o2 = new String("Welcome");	
		// o2 = new String("hello"); 	
		o2 = "hello";
		System.out.println("isEquals VALUE: " + o1.equals(o2));
		System.out.println("== ADDRESS: " + (o1 == o2));	
		
	}
}
