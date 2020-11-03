package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		//lambda : instance of functional inteface
		
		Runnable runnable=()->{
			
		};
		
		Function <String,Integer> function=(String o1)->{
			return 1;
		};
		
		BinaryOperator<String> b =(String o1, String o2)->{
			return "1";
			
		};
		
		Comparator<String> comp = ( s1, s2)->{
			return s1.compareTo(s2);
			};
			
		List<String> items=Arrays.asList("x","yy", "yz","t");
		for(String item:items) {
			
		}
		items.forEach(System.out::println);
		items.stream().filter(t->t.equals("x")).collect(Collectors.toList());
			
		System.out.println("=========================");
		
		//operations
		items.stream().filter(item->{
			System.out.println("1 "+item);
			return item.contains("y");
		})
		.map(item->{
			
			return item.length();
		})
		.collect(Collectors.toList());
	}
}
