package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		// lambda: instance of functional interface
		// anonymous class
		// parameters
		// ->
		// {body} override abstract method

		// BinaryOperator<String> operator = (s1, s2) -> " ";
		Comparator<String> comp = Comparator.comparing(Function.identity());

		/*
		 * Function<String, Integer> function = (String s) -> { return 1; };
		 * 
		 * Runnable runnable = () -> {
		 * 
		 * };
		 */
		List<String> items = Arrays.asList("x", "yy", "yz", "t");
		// neu dung vong for thi -> external iterator

		items.forEach(System.out::println);// -> internal iteration
		items.stream().filter(t -> t.equals("x")).collect(Collectors.toList());

		// operations
		System.out.println("==================");
		items.stream().filter(item -> {
			System.out.println(item);
			return items.contains("y");
		}).map(item -> {
			return item.length();
		}).collect(Collectors.toList());//->terminal operation
		
		//distinct
		
		items.stream().distinct();
		

	}
}
// thay vi new functional interface thi goi lambda