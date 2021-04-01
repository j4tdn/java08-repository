package test;

import org.mindrot.jbcrypt.BCrypt;

public class Hoang {
	public static void main(String[] args) {
		String password = "stackjava123456.com";
		boolean hash = BCrypt.checkpw(password, "$2a$10$8Cof0cOQrqgVy.Pa/dDRW.8ZTm9kltOS4kodL0qW9TFewHwe/AUcW");
		System.out.println("BCrypt hash: " + hash);
	}
}
