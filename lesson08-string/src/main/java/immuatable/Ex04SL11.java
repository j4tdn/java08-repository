package immuatable;

public class Ex04SL11 {
	
	public static void main(String[] args) {
		String s = "cheers from class";		
		String s1="       welcome           ";
		
		System.out.println("startwith: "+s.startsWith("cheers"));
		System.out.println("endtwith: "+s.endsWith("class"));
		
		s=s.replace("cheers", "hello");		
		System.out.println(s);
		s1=s1.trim(); //remove redundant spaces
		System.out.println(s1);
		
		System.out.println("sub string: "+s.substring(2,4));
		System.out.println(s.contains("from"));
	}
	
}
