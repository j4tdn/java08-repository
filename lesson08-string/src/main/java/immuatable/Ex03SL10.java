package immuatable;

import utils.StringUtils;

public class Ex03SL10 {
	public static void main(String[] args) {
		String s = "how are you";
		String s1 = "\nI'm great, thanks !!!";
		String s2 = "a";
		String s3 = "aBcD172#@!";
		
		System.out.println("Length of s: " + s.length());
		s = s.concat(s1);
		System.out.print("Noi s1 vao s: " + s);
		System.out.print("\ncharAt: " + s.charAt(3));
		
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		System.out.println("Vi tri xuat hien dau tien: " + s.indexOf(s2));
		System.out.println("Vi tri xuat hien cuoi cung: " + s.lastIndexOf(s2));
		
		System.out.println("Number Of Lower Chars: " + StringUtils.counter(s3).getNumberOfLowerChars());
		System.out.println("Number Of Upper Chars: " + StringUtils.counter(s3).getNumberOfUpperChars());
		System.out.println("Number Of Digits: " + StringUtils.counter(s3).getNumberOfDigits());
	}
	
	
}
