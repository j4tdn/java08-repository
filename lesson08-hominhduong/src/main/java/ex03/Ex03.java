package ex03;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class Ex03 {
	public static String ChuyenDoiTV(String s) {
		String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		return pattern.matcher(temp).replaceAll("").replaceAll("Đ", "D").replace("đ", "d");
	}

	public static void main(String[] args) {
		System.out.print(ChuyenDoiTV("Em có yêu anh không anh để anh biết còn chờ \nEm xin lỗi em đã có thái độ không đúng với anh"));
	}
}
