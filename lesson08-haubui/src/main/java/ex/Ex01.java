package ex;
import java.util.Arrays;
import java.util.regex.Pattern;

import static constant.DefaultPattern.WHITESPACE;

public class Ex01 {


	public static void getChars(String input) {
		System.out.println(Arrays.toString(input.trim().toCharArray()));
	}

	public static void getWords(String input) {
		Pattern.compile(WHITESPACE).splitAsStream(input.trim()).forEach(System.out::println);
	}

	public static void charsReverse(String input) {
		System.out.println(new StringBuffer(input.trim()).reverse());;
	}

	public static void wordsReverse(String input) {
		String[] words = Pattern.compile(WHITESPACE).split(input.trim());
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.println(words[i]);
		}
	}

	public static void main(String[] args) {
		String input = "  Toi la bui hau ";
		getChars(input);
		getWords(input);
		charsReverse(input);
		wordsReverse(input);
	}
}
