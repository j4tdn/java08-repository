package collections.set;

public class HashcodeEquals {
	public static void main(String[] args) {
		// hashcode vs identityhashcode
		// hashcode: convert object value to hash value by funtion 
		//		   : able override
		//identityHashcode : object memory address
		//				   :  can't override
		
		String s1=new String("hello");
		String s2="hello";
		
		System.out.println(s1==s2);
		
		System.out.println("s1 hashcode "+s1.hashCode());
		System.out.println("s2 hashcode "+s2.hashCode());
		
		System.out.println("s1 identityHashcode "+System.identityHashCode(s1));
		System.out.println("s2 identityHashcode "+System.identityHashCode(s2));
		
		
	}
}
