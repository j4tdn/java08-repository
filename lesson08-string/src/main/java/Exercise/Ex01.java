package Exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import StringUtils.StringUtils;

public class Ex01 {
	
	
	
	public static void main(String[] args) {
		String input = "abcccccdddeeeee";
		
		IntStream is = input.chars();
		
		Map<Object,Long> map = input.chars().mapToObj(value-> (char)value)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		map.entrySet().forEach(entry -> {
			System.out.print("key : " + entry.getKey());
			System.out.println(" \t value :" + entry.getValue());
		});
		
		
//		char[] chars = input.toCharArray();
//		
//		//sorted string 
//		Arrays.sort(chars);
//
//		//sorted string 
//		
//		input = String.valueOf(chars);
//		
//		StringBuilder builder = new StringBuilder(input);
//		
//		
//		
//		
//		
//		String[] stringCounter = input.split("[a-z]+");
//		
//		
//		
//		StringUtils.forEach(stringCounter, counter -> System.out.println(counter));
//		
//		
//		
//		
//		
		
		RemoveSameValue(input);
	}
	
	public static void RemoveSameValue(String str) {
		Stream<String> els = Pattern.compile("").splitAsStream(str);
		
		
		StringBuilder builder = new StringBuilder();
		Stream<String> elDistinct = els.distinct();
		
		Consumer<String> consumer = (el) -> builder.append(el);
		
		elDistinct.forEach(consumer);
		
		System.out.println(builder);
		
		
	}
	
	public static void countStringEl(String str) {
		
		
		
		
	}
}
