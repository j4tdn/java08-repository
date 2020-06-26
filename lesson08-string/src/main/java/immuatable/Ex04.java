package immuatable;

public class Ex04 {
	public static void main(String[] args) {
		
		String s = "cheers from class";
		
		String s1 = "       wellcome    ";
		
		String s2 = "hello";
		
		String s3 = "    hello     ";
		
		//remove redundant spaces 
		s1 = s1.trim();
	
		System.out.println(" trim :  " +s1);
		
		
		//1
		System.out.println("startWith : " +s.startsWith("cheers"));
		
		System.out.println("endWith : " +s.endsWith("class"));
		
		//2
		s = s.replace("cheers", "hello");
		
		System.out.println("replace :"+ s);
		
		
		System.out.println("sub string :" + s.substring(2, 4));
		
		System.out.println(s.contains("from"));
		
	}
}
