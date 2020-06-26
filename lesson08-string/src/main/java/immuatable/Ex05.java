package immuatable;

public class Ex05 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hhllo";
		// s2 + s1 : new String(s2 + "lo")
		System.out.println(s1.compareTo(s2));
	}
}
