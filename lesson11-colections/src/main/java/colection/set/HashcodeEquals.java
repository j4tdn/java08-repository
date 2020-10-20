package colection.set;

public class HashcodeEquals {
	public static void main(String[] args) {
		//hashcode vs idenrityHashCode
		//hashcode : convert object value to hash value by a function
		//			: oble to override
		// identityHashcode : object memory address
		//					: cannot override
		
		String s1 = new String("hello");
		String s2 = "hello";
		
		System.out.println(s1==s2);
		System.out.println("s1 hashcode: "+s1.hashCode());
		System.out.println("s2 hashcode: "+ s2.hashCode());
		
		System.out.println("s1 i hashcode: "+System.identityHashCode(s1));
		System.out.println("s2 i hashcode: "+ System.identityHashCode(s2));
		
	}

}
