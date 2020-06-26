package immuatable;

public class Ex04SL11 {
	public static void main(String[] args) {
		//compareTo
		String s1 = "hello";
		//String s2 = "hello";
		//String s2 = "hfllo"; //-1
		String s2 = "hh"; //-3 dua vao bang ma asci
		
		String s3 = "hel";
		s3 = s3 + "lo"; //da new ra 1 o nho moi, s2 + "lo" = new String(s2 + "lo")
		
		System.out.println("s1: " + System.identityHashCode(s1));
		System.out.println("s1: " + System.identityHashCode(s2));
		System.out.println(s1 == s3); //test thu, bth ko dung ==
		
		System.out.println(s1.compareTo(s2));
	}
}
