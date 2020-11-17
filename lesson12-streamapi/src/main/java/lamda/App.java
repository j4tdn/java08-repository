package lamda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		// lamda: instance of Functional Interface
		// instance: 1 obj
		// anonymous class
		// paprameters: số lượng tham số trong hàm trừu tượng, ko có thì ()
		// ->
		// {body} override từ abstract method

//		Runnable runnable = () -> {
//			
//		};

//		Function<String, Integer> function = 
//				(String s) -> {
//					return 1;
//				};

		BinaryOperator<String> operator0 = (String s1, String s2) -> {
			return "";
		};

		BinaryOperator<String> operator = (s1, s2) -> "";
		
		Comparator<String> comp0 = (s1, s2) -> {
			return s1.compareTo(s2);
		};
		
	//	Comparator<String> comp = Comparator.comparing(Person::getName);
	//	Comparator<String> comp = Comparator.comparing(s -> s);
		Comparator<String> comp = Comparator.comparing(Function.identity());
		
		List<String> items = Arrays.asList("x", "yy", "yz", "t");
		for (String item: items) {
			//exteral interation: tu for, tu duyet
		}
		
		items.forEach(System.out::println);
		items.stream().filter(t -> t.equals("x")).collect(Collectors.toList());
	
		//operations
		System.out.println("===================");
		items.stream().filter(item -> {
			System.out.println( "1: " + item);
			return item.contains("y");
		})
		.map(item -> {
			System.out.println( "2: " + item);
			return item.length();
		})
		.limit(1)
		.collect(Collectors.toList());
		
		//distinct
		items.stream().distinct();
	}
}
