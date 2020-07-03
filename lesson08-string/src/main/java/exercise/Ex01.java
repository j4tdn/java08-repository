package exercise;

import java.util.Map;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex01 {
	public static void main(String[] args) {
		String input = "abcdecbfk";
		
		Map<Object, Long> map = input.chars() // inStream
				//.boxed()
				.mapToObj(value -> (char) value)
				.collect(Collectors.groupingBy(
						Function.identity(), 
						Collectors.counting()));
		map.entrySet().forEach(entry -> {
			System.out.println("key: " + entry.getKey());
			System.out.println("value: " + entry.getValue());
		});

		// char[] chars = input.toCharArray(); // chuyen sang mang char
		// Arrays.sort(chars); // tang dan (ascending)

		// sorted string
		// input = String.valueOf(chars);
		// System.out.println("sorted: " + input);

		// String[] stringCounter = input.split("[a-z]+");
		// System.out.println("length: " + stringCounter.length);
		// StringUtils.forEach(stringCounter, counter -> System.out.println(counter));

	}
}
