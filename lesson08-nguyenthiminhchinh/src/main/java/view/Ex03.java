package view;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class Ex03 {
	public static void main(String[] args) {
		String s1 = "Em có yêu anh không anh để anh biết còn chờ";
		System.out.println(unAccent(s1));

		String s2 = "Em xin lỗi em đã có thái độ không đúng với anh ";
		System.out.println(unAccent(s2));
	}

	public static String unAccent(String s) {
		String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		return pattern.matcher(temp).replaceAll("").replaceAll("Đ", "D").replace("đ", "d");

	}
}
