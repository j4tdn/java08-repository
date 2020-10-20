package collections.set;

public class HashCodeEquals {
	public static void main(String[] args) {
		// HashCode and identityHashCode
		// HashCode : Convert object value to hash value by function 
		//          able to override
		//identityHashCode: object memory address
		//                :cannot override
		
		
		String s1 = new String("Hello");
		String s2="Hello";
		
		System.out.println(s1==s2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		
	}
}
