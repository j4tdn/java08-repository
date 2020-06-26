package immuatable;

import utils.StringUtils;

public class Ex03SL10 {
	public static void main(String[] args) {
		String s = "how are you";
		String s1 = "\nthanks";
		String s2 = "a";

		System.out.println("length: " + s.length());
		s = s.concat(s1);
		System.out.println("concat: " + s);
		System.out.println("char at 2: " + s.charAt(2));
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println("index s2 of s: " + s.indexOf(s2));
		System.out.println("last index s2 of s: " + s.lastIndexOf(s2));

		System.out.println("\n=============================\n");
		String s3 = "aBcD172#@!";

		System.out.println(StringUtils.count(s3));
	}
}
