package collection.set;

public class HardCodeEquals {
	public static void main(String[] args) {
		// hashCode vs identityHashCode
		// hashCode : convert object value to hash value by function 
		//          : able to override
		// identityHashCode : object memory address
		//                  : can not override
		String s1 = new String("Hello");
		String s2 = "Hello";
		System.out.println("E1: " + (s1 == s2));
		System.out.println("E1 code: " + s1.hashCode());
		System.out.println("E2 code: " + s2.hashCode());
		
		System.out.println("E1 i code: " + System.identityHashCode(s1));
		System.out.println("E2 i code: " + System.identityHashCode(s2));
	}
	
	
}
