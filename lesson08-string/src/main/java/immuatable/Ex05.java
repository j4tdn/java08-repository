package immuatable;

public class Ex05 {
	public static void main(String[] args) {
		// compareTo
		String s1 = "hello";
		System.out.println("S1: " + System.identityHashCode(s1));
		
		String s2 = "hel";
		System.out.println("S2: " + System.identityHashCode(s2));
		s2 = s2 + "lo"; // s2 + "lo" = new String(s2 + "lo");
		System.out.println("S2: " + System.identityHashCode(s2 + "lo"));
		
		System.out.println(s1==s2);
	}
}
