package exercise;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex01 {
	public static void main(String[] args) {
		String input = "asfaskmsckaw";
		Map<Object, Long> map=input.chars()
				.mapToObj(value -> (char)value)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
				map.entrySet().forEach(entry ->{
					System.out.println("key:\t"+ entry.getKey());
					System.out.println("value:\t"+ entry.getValue());
				});
		
		
		
		
		/*
		 * char[] chars = input.toCharArray(); Arrays.sort(chars); input =
		 * String.valueOf(chars); System.out.println(input); String[] stringCounter =
		 * input.split("[a-z]+"); System.out.println("lenght: "+stringCounter.length);
		 * StringUtils.forEach(stringCounter, counter -> System.out.println(counter));
		 */
	}
}