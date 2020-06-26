package immuatable;

import org.w3c.dom.ls.LSException;

import util.StringUtil;

public class Ex03SL10 {
	public static void main(String[] args) {
		String s = "how are you";
		String s1 = "\nI'm great, thanks!!!";
		String s2 = "a";
		String s3 = s.concat(s1);
		String s4 = "aBcD172#@";

		System.out.println("lenght s :" + s.length());
		System.out.println("lenght s1 :" + s1.length());
		System.out.println("lenght s2 :" + s2.length());
		System.out.println(s3);
		System.out.println(s.charAt(2));
		for(int i =0; i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println(s.indexOf(s2));
		System.out.println(s.lastIndexOf(s2));
		
		System.out.println(StringUtil.count(s4));
		
	}

}
