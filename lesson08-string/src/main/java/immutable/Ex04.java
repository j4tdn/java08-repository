package immutable;

public class Ex04 {

	public static void main(String[] args) {
		String s = "cheers from class";
		String s1 = "  welcome  ";
	
		
		System.out.println("StartsWith: " + s.startsWith("cheers"));
		System.out.println("EndsWith: " + s.endsWith("cheers"));
		s = s.replace("cheers", "hello");
		System.out.println("replace: " + s);
		System.out.println("remove redundant spaces: " + s1.trim());
		//System.out.println("subString: " + s.substring(5));
		System.out.println("subString: " + s.substring(0, 5));
		System.out.println("check contain: " + s.contains(s1));
		
		
	}

}
