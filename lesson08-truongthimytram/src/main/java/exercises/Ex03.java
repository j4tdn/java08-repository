package exercises;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class Ex03 {

	public static void main(String[] args) {
		String s = "một ngày cúp điện, đang ngồi quán cà phê!";
		System.out.println(convertString(s));

	}
	private static String convertString(String s) {
		String temp = Normalizer.normalize(s, Normalizer.Form.NFD);

		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

		return pattern.matcher(temp).replaceAll("").replaceAll("đ", "d");
	}

}
