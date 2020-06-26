package immuatable;

import utils.StringUtils;

public class Ex03SL10 {
	public static void main(String[] args) {
		String s = "how are you";
		String s1 = "\n, I'm great, thank";
		String s2 = "a";
		
		String s3 = "aBcD172#@!";

		System.out.println("length s: " + s.length());
		System.out.println("length s + s1: " + s + s1);
		System.out.println("length s[1] : " + s.charAt(1));
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + " ");
		}
		System.out.println("first s3 in s :" + s.indexOf(s2));
		System.out.println("last s3 in s :" + s.lastIndexOf(s2));
		
		System.out.println(StringUtils.StringCounter(s3));
	}
}
