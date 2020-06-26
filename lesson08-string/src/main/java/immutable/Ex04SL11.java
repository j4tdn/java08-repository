package immutable;

/*
 * compareTo
 */
public class Ex04SL11 {
	public static void main(String[] args) {
		String s = "cheers from class";
		String s2 = "lead";
		String s3 = "    welcome     ";
		System.out.println("contains: "+s.contains("from"));
		System.out.println("start with"+s.startsWith("cheers"));
		System.out.println("end with\t"+s.endsWith("class"));
		System.out.println();
		s=s.replace("cheers", "hello");
		System.out.println("replace: "+s);
		//remove redundant spaces
		System.out.println(s3.trim());
		System.out.println("sub string: "+s.substring(2, 4));
		
	}
}
