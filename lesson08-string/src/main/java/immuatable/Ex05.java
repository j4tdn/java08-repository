package immuatable;

public class Ex05 {
	public static void main(String[] args) {
		//compare To 
		String s1="hello";
		String s2="hello";
		
		String s3="Z";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s3.compareTo(s1));
		
		
		String s4="hello";
		System.out.println("s4 :" +System.identityHashCode(s4));
		String s5 = "hel";
		
		s5 =s5 +"lo";
		
		System.out.println( "s5: " +System.identityHashCode(s5));
		
		
		
		
	}
}
