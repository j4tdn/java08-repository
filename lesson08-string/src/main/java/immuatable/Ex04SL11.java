package immuatable;

public class Ex04SL11 {

	public static void main(String[] args) {
		String s = "cheer to class";
		String s1 = "   welcome    ";
		System.out.println("contains: "+ s.contains("to"));
		System.out.println("startsWith: " + s.startsWith("cheer"));
		System.out.println("endsWith: " + s.endsWith("class"));
		s = s.replace("cheer", "hello");
		System.out.println("replace : " + s);
		
		//remove redundant spaces
		s1 = s1.trim();
		System.out.println("replace : " + s1);
		
		System.out.println("sub string : "+ s.substring(2,4));
		

	}

}
