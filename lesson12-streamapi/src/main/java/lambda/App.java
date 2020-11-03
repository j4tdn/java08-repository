package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		Comparator<String> comp = Comparator.comparing(Function.identity());
		List<String> items = Arrays.asList("x", "yy", "yz", "t");
		
		items.forEach(System.out::println);
		items.stream().filter(t -> t.equals("x"))
			.collect(Collectors.toList());
		
		//operations
		System.out.println("======================");
		items.stream()
		.filter(item -> {
			System.out.println("1: " + item);
			return item.contains("y");
		})
		.map(item -> {
			System.out.println("2: " + item);
			return item.length();
		})
		.limit(1)
		.collect(Collectors.toList());
	}

}
