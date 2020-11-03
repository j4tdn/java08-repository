package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		//lambda : instance of Funcional Interface
		//anony
		//para
		// ->
		//{body}
//		Runnable runnable	= () -> {
//			System.out.println();
//		};
//		 
//		Function<String, Integer> function = (String s) -> {
//			return 1;
//		};
//		BinaryOperator<String> binaryOperator = ( s1, s2) -> "";
//		
//		Comparator<String> comp = (s1,s2) -> {
//			return s1.compareTo(s2);
//		};
		
		List<String> items = Arrays.asList("x","yy","yz","z");
		//operations
		items.stream()
		.filter(item -> {
			System.out.println("1: "+item);
			return item.contains("y");
		})
		.map(item -> {
			System.out.println("2: "+ item);
			return item.length();
		})
		.collect(Collectors.toList());
	}

}
