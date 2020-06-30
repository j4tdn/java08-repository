package immutable;

public class Ex01 {

	public static void main(String[] args) {
		// String literal
		
		String l1 = "hello";
		String l2 = "hello";
		System.out.println("isEquals Value: " + l1.equals(l2));
		System.out.println("== address: " + (l1 == l2));
		
		
		// String object
		
		String o1 = new String("welcome");
		String o2 = new String("welcome");
		//o2 = new String("hello");
		o2 = "hello";
		System.out.println("isEquals Value: " + o1.equals(o2));
		System.out.println("== address: " + (o1 == o2));
		
		

	}

}
