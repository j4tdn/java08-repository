package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		// lambda: instance of Functional interface
		// anonymous class
		// paramater
		Runnable runnable = () -> {
		};
		BinaryOperator<String> binaryOperator = (String t, String u) -> {
			return "asd";
		};

		Comparator<String> comp = Comparator.comparing(Function.identity());
		List<String> items = Arrays.asList("x", "yy", "yz", "t");

		for (String string : items) {
			// external iteration
		}

		items.forEach(System.out::println);
		items.stream().filter(t -> t.equals("x")).collect(Collectors.toList());

		items.stream().filter(item -> {
			System.out.println(item);
			return item.contains("y");
		}).map(item -> {
			System.out.println("2" + item);
			return item.length();
		}).collect(Collectors.toList());
	}
}
