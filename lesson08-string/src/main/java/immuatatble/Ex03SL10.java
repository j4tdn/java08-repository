package immuatatble;

import utils.StringUtils;

public class Ex03SL10 {
	public static void main(String[] args) {
		String s = "How are you";
		String s1 = "\n I'm great, thanks !!!";
		String s2 = "a";
		String s3 = "aBcD172#@!";

		System.out.println("Chieu dai chuoi: " + s.length());

		String s4 = s + s1; // cach 1
		System.out.println("Noi chuoi s1 vao s cach 1: " + s.concat(s1)); // cach 2
		System.out.println("Noi chuoi s1 vao s cach 2: " + s4);

		System.out.println("Lấy một ký tự tại vị trí index trong chuỗi s: " + s.charAt(2));

		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + " "); // duyet tung phan tu trong chuoi
		}

		System.out.println("\n==============");
		System.out.println("dau tien: " + s.indexOf(s2));// Tìm vị trí xuất hiện đầu tiên của chuỗi s2 trong chuỗi s
		System.out.println("cuoi: " + s.lastIndexOf(s2)); // Tìm vị trí xuất hiện cuối cùng của chuỗi s2 trong chuỗi s

		System.out.println("==============");
		System.out.println("lower: " + StringUtils.count(s3).getNumberOfLowerChars());
		System.out.println("upper: " + StringUtils.count(s3).getNumberOfUpperChars());
		System.out.println("digit: " + StringUtils.count(s3).getNumberOfDigital());
	}
}