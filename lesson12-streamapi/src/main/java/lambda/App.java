package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		// lambda: instance of functional interface
		// annonymous class
		// (parameters) -> { body: override from abstract method }

		/*
		 * Function<String, Integer> function = (String s) -> { return 1; };
		 */

		// BinaryOperator<String> binaryOperator = (s1, s2) -> "";

		Comparator<String> comp = Comparator.comparing(Function.identity()); // s->s
		List<String> items = Arrays.asList("x", "yy", "yz", "t");
		for (String item : items) {
			// external iteration
		}
		items.forEach(System.out::println);
		items.stream().filter(i -> i.equals("x")).collect(Collectors.toList()); // internal iteration

		// operations
		System.out.println("=========");
		items.stream().filter(item -> {
			System.out.println("1: "+item);
			return item.contains("y");
		}).map(item -> {
			System.out.println("2: " + item);
			return item.length();
		}).collect(Collectors.toList());
		
		// distinct
		items.stream().distinct();

	}

}
