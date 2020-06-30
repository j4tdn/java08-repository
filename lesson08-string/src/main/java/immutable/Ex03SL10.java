package immutable;

import utils.StringUtils;

public class Ex03SL10 {

	public static void main(String[] args) {
		String s = "how are you?";
		String s1 = "\nI'm great, thanks !";
		String s2 = "a";
		String s3 = "aBCd123@!";
		
		System.out.println("length of s: " + s.length());
		
		System.out.println("====================================");
		
		System.out.println("s + s1: " + s.concat(s1));
		
		System.out.println("====================================");
		
		System.out.println("character of position 4th: " + s.charAt(3));
		
		System.out.println("====================================");
		
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
			
		}
		
		System.out.println("====================================");
		
		System.out.println("first index of s2: " + s.indexOf(s2));
		System.out.println("first index of s2: " + s.lastIndexOf(s2));
		
		System.out.println(" counter: " + StringUtils.counter(s3));

			
		

	}

}
