package immuatable;

public class Ex01 {
	public static void main(String[] args) {
		// String literal
		String s1 = "hello";
		String s2= "hello";
		System.out.println("isEqual VALUE:" + s1.equals(s2));
		System.out.println("== ADDRESS:" + (s1 == s2));
		
		// String object
		String o1 = new String("welcome");
		String o2 = new String("welcome");
		System.out.println("isEqual VALUE:" + o1.equals(o2));
		System.out.println("== ADDRESS:" + (o1 == o2));
		o2 = new String("hello");
		o2 = "hello";
		
	}

}
