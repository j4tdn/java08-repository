import java.text.Normalizer;
import java.util.regex.Pattern;

import utils.StringUtils;

public class Ex03 {

	public static void main(String[] args) {
		String str = StringUtils.input();
		System.out.println(unsignedString(str));
	}	

	public static String unsignedString(String str) {
		String temp = Normalizer.normalize(str, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		return pattern.matcher(temp).replaceAll("").replace('đ','d').replace('Đ','D');
	}

}
