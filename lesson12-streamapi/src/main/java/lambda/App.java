package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		// lambda: instance of functional interface

		Comparator<String> comp = Comparator.comparing(Function.identity());
		
		List<String> items = Arrays.asList("x","yy","zz","t");
		
		List<Integer> numbers = Arrays.asList(1,2,3,1,2,1);

		Map<Integer,Long> qtyMap = numbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(qtyMap);
	}
}
