package lambda;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class App {
	public static void main(String[] args) {
		// lambda: instance of Functional interface (interface has only 1 method)
		// anonymous class
		// parameters
		// ->
		// {body} override from abstract method
		
		BinaryOperator<String> func = (s1, s2) -> s1;	
		Comparator<String> comp = Comparator.comparing(Function.identity());
		
	}
}
