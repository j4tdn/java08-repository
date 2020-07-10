package utils;

import java.text.Normalizer;
import java.util.regex.Pattern;

public final class StringUtils {
	
	private StringUtils() {
	}

	public static String[] getWords(String input, String pattern) {
		return Pattern.compile(pattern).split(input.trim());
	}
	
	public static String removeDiacritic(String z) {
		String temp = Normalizer.normalize(z, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}");
		return pattern.matcher(temp).replaceAll("").replaceAll("Ð", "D").replaceAll("đ", "d");
	}
}
