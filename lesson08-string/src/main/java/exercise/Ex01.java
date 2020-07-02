package exercise;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.w3c.dom.css.Counter;

import utils.StringUtils;

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
		
		/*
		 * char[] chars = input.toCharArray();
		 * 
		 * //sort ascending Arrays.sort(chars);
		 * 
		 * //sorted String input = String.copyValueOf(chars); //System.out.print(input);
		 * String[] stringCounter = input.split("[a-z]+"); System.out.println("length: "
		 * + stringCounter.length);
		 * 
		 * StringUtils.forEach(stringCounter, Counter -> System.out.println(Counter));
		 */
	}
}
