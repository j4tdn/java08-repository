package immuatatble;

public class Ex05 {
	public static void main(String[] args) {
		// compare to
		String s1 = "hello";
		String s2 = "hhl";

		s2 = s2 + "lo"; // s2 + "lo" = new String (s2 + "lo")

		System.out.println(s1==s2);
		System.out.println(s1.compareTo(s2));
	}
}
