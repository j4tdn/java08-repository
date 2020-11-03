package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		// lambda: instance of Functional Interface

		// anonymous class
		// + paramerter
		// + ->
		// + {body}
		Runnable runnable = () -> {

		};
		List<String> items = Arrays.asList("x", "yy", "yz", "t");
		for (String item : items) {

		}
		items.forEach(System.out::println);
		items.stream().filter(t -> t.equals("x")).collect(Collectors.toList()).forEach(System.out::println);;
	
		System.out.println("=============");
		items.stream().filter(iteam->{System.out.println("1 "+iteam);
		return  iteam.contains("y");})
		.map(iteam->{
			System.out.println("2 "+iteam);
			return iteam.length();
		})
		.limit(1)
		.collect(Collectors.toList());
		
		//distinct
		
		
	}
}

//	Function<String, Integer> function=(String s)->{
//		return 1;
//	};
//	BinaryOperator<String> binary=(o1,o2)-> "hello";

//	Comparator<String> com=(s1,s2)->{return s1.compareTo(s2);};
