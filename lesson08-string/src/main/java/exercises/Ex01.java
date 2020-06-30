package exercises;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex01 {
	public static void main(String[] args) {
		String input = "abcdecbfk";

		Map<Object, Long> map = input.chars()
				// .boxed()
				.mapToObj(value -> (char) value)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		map.entrySet().forEach(entry -> {
			System.out.println("key: " + entry.getKey());
			System.out.println("value: " + entry.getValue());
		});
//		Stream<String> strPattern = Pattern.compile("").splitAsStream(input);
//		strPattern.distinct();
//		char[] chars = input.toCharArray();
//		
//		// sort ascending
//		Arrays.sort(chars);
//		
//		// sorted string
//		input = String.valueOf(chars);
//		String[] stringCounter = input.split("[a-z]+");
//		StringUtils.forEach(stringCounter, counter -> System.out.println(counter));
//		input = input.replaceAll("[a-z]+", "");
//		System.out.println(input);
	}
}
