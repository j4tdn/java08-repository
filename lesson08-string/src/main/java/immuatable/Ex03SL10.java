package immuatable;

import utils.StringUtils;

public class Ex03SL10 {
	public static void main(String[] args) {
		String s="how are you";
		String s1="\n. i'm great, thanks !!!";
		String s2="a";
		String s3="aBcD172#@!";
		int ls=s.length();
		int ls1=s1.length();
		int ls2=s2.length();
		
		s=s.concat(s1);
		
	    s.charAt(2);
	    
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		
		System.out.println("================");
		System.out.println(s.indexOf(s2));
		System.out.println(s.lastIndexOf(s2));
	
		System.out.println(StringUtils.count(s3).getNumberofdigital());
		System.out.println(StringUtils.count(s3).getNumberoflowerchar());
		System.out.println(StringUtils.count(s3).getNumberofuperchar());
	}

}
