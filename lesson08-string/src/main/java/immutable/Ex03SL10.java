package immutable;

import utils.StringUtil;

public class Ex03SL10 {
	public static void main(String[] args) {
		String s = "How are you";
		String s1 = "\nI'm great, thanks!!!";
		String s2 = "a";
		
		String s3 = "aBcD172#@!";
		System.out.println(StringUtil.counter(s3));
		
		System.out.println("\n=====================\n");
		
		System.out.println("Length s: " + s.length());
		System.out.println("Noi chuoi: " + s.concat(s1) + ", " + s);
		System.out.println("Char At: " + s.charAt(2));
		
		System.out.println("\n=====================");
		System.out.println("Duyet phan tu cua s:");
		for (int i = 0; i < s.length(); i++) 
			System.out.print(s.charAt(i) + "    ");
		
		System.out.println("\n=====================\n");
		
		System.out.println("First char: " + s.indexOf(s2));
		System.out.println("Last char: " + s.lastIndexOf(s2));
	}
}
