package exercise;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex01 {
	public static void main(String[] args) {
		String input = "abcdecbfk";
		
		Map<Object, Long> map = input.chars()
				//.boxed
				.mapToObj(value -> (char) value)
				.collect(Collectors.groupingBy(
						Function.identity(), 
						Collectors.counting()));

		map.entrySet().forEach(entry -> {
			System.out.println("key:" + entry.getKey());
			System.out.println("value:" + entry.getValue());
		});
	}
}
