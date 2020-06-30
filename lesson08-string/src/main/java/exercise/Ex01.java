package exercise;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Ex01 {

	public static void main(String[] args) {
		String input = "abcdecbfk";
		
//		IntStream is = input.chars();
//		Stream<Character> stream = is.mapToObj(value -> Character.valueOf((char)value));
//		stream.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		Map<Object, Long> map = input.chars()
				.mapToObj(value -> Character.valueOf((char)value))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		map.entrySet().forEach(entry -> {
			System.out.println("key: " + entry.getKey());
			System.out.println("value: " + entry.getValue());
		});
//				(new IntFunction<Character>() {
//			@Override
//			public Character apply(int value) {
//				return Character.valueOf((char)value);
//			}
//		});
//		
	   //	input.chars().forEach(digit -> System.out.println(digit));
		
//		byte ttt = 65;
//		System.out.println((char)ttt);
//		char[] chars = input.toCharArray();
//		
//		//ascending
//		Arrays.sort(chars); 
//		
//		//sorted string
//		input = String.valueOf(chars);
//		System.out.println(chars);
//		String[] stringCounter = input.split("[a-z]+");
//		System.out.println("length: " + stringCounter.length);
//		StringUtils.forEach(stringCounter, counter -> System.out.println(counter));
//		
//		Stream<String> result = Pattern.compile(" ").splitAsStream(s).distinct();
//		result.forEach(action);

	}

}
