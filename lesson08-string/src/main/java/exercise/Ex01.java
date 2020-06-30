package exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Ex01 {
	public static void main(String[] args) {
		String s = "abcddefgh";

		// Distinct chuoi
		// Oneline way
		String distinctString = Pattern.compile("").splitAsStream(s).distinct().map(e -> e.toString())
				.collect(Collectors.joining());
		System.out.println(distinctString);

		// Dem so phan tu trong chuoi
		// Cach 1:
		Map<String, Integer> number = new HashMap<String, Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (number.containsKey(s.charAt(i))) {
				number.put(s.charAt(i) + "", number.get(s.charAt(i)) + 1);
			} else {
				number.put(s.charAt(i) + "", 1);
			}
		}

		// Cach 2: using Java8

		Map<Object, Long> map = s.chars().mapToObj(value -> (char) value)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		map.entrySet()
				.forEach(entry -> 
				System.out.println("key: " + entry.getKey() 
				+ " ------ value: " + entry.getValue()));

	}
}
