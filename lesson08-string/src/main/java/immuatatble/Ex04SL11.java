package immuatatble;

public class Ex04SL11 {
	public static void main(String[] args) {
		String s = "cheers from class";
		String s1 = "    Welcome   ";

		System.out.println("starstWith cheers: " + s.startsWith("cheers"));
		System.out.println("endstWith cheers: " + s.endsWith("cheers"));

		s = s.replace("cheers", "hello");
		System.out.println("replace: " + s);

		// remove redundant spaces
		s1 = s1.trim();
		System.out.println("trim: " + s1);

		System.out.println("sub string: " + s.substring(2, 4));

		System.out.println("contain: " + s.contains(s1));
	}
}
