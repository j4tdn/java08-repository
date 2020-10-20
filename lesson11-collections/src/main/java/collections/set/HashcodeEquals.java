package collections.set;

public class HashcodeEquals {
	public static void main(String[] args) {
		// hashcode vs identityHashCode
		//hashcode: convert object value to hash value by Function
		//		  : able to override
		//identityHashcode: object memory address
		//				  : Cannot override
		
		String s1 = new String("Hello");
		String s2 = "Hello";
		System.out.println("E1:" + (s1 == s2));
		System.out.println("S1 code: " + s1.hashCode());
		System.out.println("S2 code: " + s2.hashCode());
		
		System.out.println("S1 i code:" + System.identityHashCode(s1));
		System.out.println("S2 i code:" + System.identityHashCode(s2));
	}
}
