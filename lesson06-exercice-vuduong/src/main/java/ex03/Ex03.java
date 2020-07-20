package ex03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println(checkValidEmail("a5@gmail.com"));
	}
	
	private static boolean checkValidEmail(String email) {
		email = email.toLowerCase();
		Pattern pattern = Pattern.compile("[a-z0-9]+@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}");
		
		Matcher matcher = pattern.matcher(email);
		
		return matcher.find();
	}
}
