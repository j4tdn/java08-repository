package immutable;

import utils.StringUtils;

public class Ex03SL10 {
	public static void main(String[] args) {
		String s = "how are you";
		String s1 = "\n I'm great, thanks !!!";
		String s2 = "a";

		//
		System.out.println("lenght of s: " + s.length());
		s1 = s1.concat(s);
		System.out.println("concat: s1+s " + s1);
		System.out.println("charater of position from s" + s.charAt(1));
		System.out.println("foreach ");
		for (char item : s.toCharArray()) {
			System.out.print(item + " ");
		}
		// vi tri dau tien, cuoi cung s2 trong s
		System.out.println(s.indexOf(s));
		System.out.println(s.lastIndexOf(s));

		String s3 = "aBVVVcD172#@!";
		System.out.println(StringUtils.stringCounter(s3).toString());
	}
}
