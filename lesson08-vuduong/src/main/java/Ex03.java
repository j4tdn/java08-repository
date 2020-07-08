import java.text.Normalizer;
import java.util.regex.Pattern;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println(convertString("đi chơi với mình đi"));
	}

	private static String convertString(String input) {
		String temp = Normalizer.normalize(input, Normalizer.Form.NFD);

		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

		return pattern.matcher(temp).replaceAll("").toLowerCase().replaceAll("đ", "d");

	}
}
