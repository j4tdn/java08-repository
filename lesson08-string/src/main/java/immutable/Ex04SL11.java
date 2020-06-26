package immutable;

public class Ex04SL11 {
	public static void main(String[] args) {
		String s = "cheers from class ";
		String s1 = "      welcome     ";
		
		System.out.println("contains: " + s.contains("from"));
		System.out.println("startWith: " + s.startsWith("cheers"));
		System.out.println("endWith: " + s.endsWith("class"));
		
		s = s.replace("cheers", "hello");
		System.out.println("Replace: " + s);
		
		// Remove redundant spaces
		s1 = s1.trim();
		System.out.println("Remove redundant space: " + s1);
		
		System.out.println("subString: " + s.substring(2, 4));			
	}
}
