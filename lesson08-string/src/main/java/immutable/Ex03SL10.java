package immutable;

import utils.StringUtils;

public class Ex03SL10 {

	public static void main(String[] args) {
		String s = "how are you";
		String s1 = "\nI'm great, thanks !!!";
		String s2 = "a";
		String s3 = "aBcD172#@!";

		System.out.println("Chieu dai chuoi s: " + s.length());
		s = s.concat(s1);
		System.out.println("Noi chuoi s1 vao s: " + s);
		System.out.println("Lay 1 ki tu tai vi tri 2 trong chuoi s: " + s.charAt(2));
		System.out.println("Duyet tung phan tu trong s: ");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + " ");
		}
		System.out.println();
		System.out.println("Vi tri dau tien: " + s.indexOf(s2));
		System.out.println("Vi tri cuoi cung: " + s.lastIndexOf(s2));

		System.out.println("So luong ki tu in thuong: " + StringUtils.count(s3).getNumberOfLowerChars());
		System.out.println("So luong ki tu in hoa: " + StringUtils.count(s3).getNumberOfUpperChars());
		System.out.println("So luong ki tu so: " + StringUtils.count(s3).getNumberOfDigits());
	}

}
