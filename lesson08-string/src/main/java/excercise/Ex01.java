package excercise;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import util.StringUtil;

public class Ex01 {
	public static void main(String[] args) {
		String input = "abcdecbfk";
		Map<Object, Long> map = input.chars().mapToObj(value -> (char) value)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		map.entrySet().forEach(entry -> {
			System.out.println("key:" + entry.getKey());
			System.out.println("value:" + entry.getValue());
		});

		/*
		 * Arrays.sort(chars);// sort ascending input = String.valueOf(chars);// sorted
		 * string
		 * 
		 * String[] stringCounter = input.split("[a-z]+"); System.out.println("lenght:"
		 * + stringCounter.length);; StringUtil.foreach(stringCounter, counter ->
		 * System.out.println());
		 */
	}

}
