package immutable;

public class Ex04SL11 {
	public static void main(String[] args) {
		String s = "cheers from class";
		String s1 = "cheers";
		String s2 = "hello";
		String s3 = "        welcome         ";

		System.out.println("S is started with S1: " + s.startsWith(s1));
		System.out.println("S is ended with S1: " + s.endsWith(s1));

		s = s.replaceAll(s1, s2);
		System.out.println("s2 replace s1 in s: " + s);

		s3 = s3.trim();
		System.out.println("Remove redundant space: " + s3);

		System.out.println("Sub string: " + s.substring(2, 4));
		
		System.out.println("Contain: " + s.contains("from"));

	}

}
