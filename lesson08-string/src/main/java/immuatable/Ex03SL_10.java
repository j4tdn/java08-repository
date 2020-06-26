package immuatable;

import util.StringUtil;

public class Ex03SL_10 {
public static void main(String[] args) {
	String s="How are you";
	String s1="\nI'm great,thanks !!!!";
	String s2="a";
	String s3="aBcD172#@!";
	
	
	System.out.println("Chieu dai cua chuoi:  "+s.length());
	System.out.println(s+""+s1);
	String ss=s.concat(s1);
	System.out.println("Noi chuoi:  "+s3);
	System.out.println("Lay mot ky tu:  "+s.charAt(2));
	
	for(int i=0;i<s.length();i++) {
		System.out.println(s.charAt(i));
	}
	System.out.println("=================");
	System.out.println(s.indexOf(s2));
	System.out.println(s.lastIndexOf(s2));	
	
	
	StringCounter counter=new StringCounter();
	System.out.println("=====================================");
	
	System.out.println(StringUtil.count(s3));
	
	
	}
}
