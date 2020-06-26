package immuatable;

public class Ex04SL11 {
	public static void main(String[] args) {
		String s = "cheers from class";
		String s3 = "         welcome     ";

		System.out.println("startsWith: " + s.startsWith("cheers"));
		System.out.println("endsWith: " + s.endsWith("class"));
		System.out.println("replace: " + s.replace("cheers", "hello"));
		System.out.println("trim: " + s3.trim());
		System.out.println("substring from 4: " + s.substring(4));
	}
}
