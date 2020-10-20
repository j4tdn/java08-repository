package collections.set;

public class HashcodeEquals {
	public static void main(String[] args) {
		// hashcode vs identityHashCode
		// hashcode: convert obj value to hash value by function
		//           able to override
		// identityHashCode: obj memory address
		//                   cannot override
		
		String s1 = new String("Hello");
		String s2 = "Hello";
		//s1 s1 khac dia chi
		
		System.out.println("e1: " + (s1 == s2)); // dia chi
		System.out.println("s1 code: " + s1.hashCode()); // tinh chung 1 cong thuc
		System.out.println("s2 code: " + s2.hashCode());
		
		System.out.println("s1 code: " + System.identityHashCode(s1)); // 
		System.out.println("s2 code: " + System.identityHashCode(s2));
		
	}
}
