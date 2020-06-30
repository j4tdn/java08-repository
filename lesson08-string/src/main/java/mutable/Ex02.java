package mutable;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import utils.StringUtils;

public class Ex02 {
	public static void main(String[] args) {
		String s = "abcdecbffk";

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			if (builder.indexOf(String.valueOf(s.charAt(i))) == -1) {
				builder.append(s.charAt(i));
			}
		}

		// Pattern.compile("-").splitAsStream(s).distinct().forEach(e ->
		// System.out.println(e));

		Map<Object, Long> map = s.chars().mapToObj(value -> (char) value)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		map.entrySet().forEach(entry -> {
			System.out.println("key: " + entry.getKey());
			System.out.println("value: " + entry.getValue());
		});

//		String temp = StringUtils.sort(s);
//
//		int count = 1;
//		int i = 0;
//		while (temp.charAt(i) != temp.charAt(temp.length() - 1)) {
//			if (temp.charAt(i) == temp.charAt(i + 1)) {
//				count++;
//			}
//
//			System.out.println(temp.charAt(i) + ": " + count);
//			i += count;
//			count = 1;
//		}
	}
}
