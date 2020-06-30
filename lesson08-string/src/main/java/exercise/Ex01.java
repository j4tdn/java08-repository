package exercise;

import java.util.Map;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex01 {
	public static void main(String[] args) {
		String input = "abcdecbfk";
		
		// IntStream is = input.chars();
		//Stream<Character> stream = is.mapToObj(value -> (char) value);
		Map<Character, Long> map = input.chars()
				.mapToObj(value -> (char) value)
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()));
		
		map.entrySet().forEach(entry -> {
			System.out.println("key " + entry.getKey() + " value: " + entry.getValue());
		});
	}
	
	/** TODO
	public static void main(String[] args) {
		String input = "abcdecbfk";
		char[] chars = input.toCharArray();
		
		Arrays.sort(chars); 	// sort ascending
		
		//sorted string
		input = String.valueOf(chars);
		System.out.println(input);
		
		String[] stringCounter = input.split("[a-z]+"); 
		System.out.println("length " + stringCounter.length);
		StringUtil.forEach(stringCounter, counter -> System.out.println(counter));
	}
	*/
	
	/* ***
	public static void main(String[] args) {
		String str = "abcdbbecbfk";
		StringBuilder s = new StringBuilder(str);
		
		for (int i = 0; i < s.length(); i++) {			
			int last = s.lastIndexOf(s.charAt(i)+"");
			while (i != last) {
				s.delete(last, last+1);
				last = s.lastIndexOf(s.charAt(i)+"");
			}
		}
		
		System.out.println(s);
	}
	*/
}
