package immutable;

import utils.StringUtils;

public class Ex03SL10 {
	public static void main(String[] args) {
		String s = "how are u?";
		String s1 = "\n I'm great, thanks !!!";
		String s2 = "a";

		System.out.println("length of S: " + s.length());

		s = s.concat(s1);
		System.out.println("Concat string: " + s);

		System.out.println("Get char at position: " + s.charAt(3));

		System.out.println("get each element in string: ");
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

		System.out.println("First index: " + s.indexOf(s2));
		System.out.println("Last index: " + s.lastIndexOf(s2));

		System.out.println("===========================");
		String s3 = "aBcD172#@!";

		System.out.println(StringUtils.count(s3));

	}

}
