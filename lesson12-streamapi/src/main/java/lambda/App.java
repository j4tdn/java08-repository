package lambda;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class App {
	public static void main(String[] args) {
		//lambda: instance of Functional Interface
		//anonymous class
		//parameters
		//->
		//{body} override from abstract method
		Runnable runnable = () -> {};
		Function<Integer, String> function = (Integer t) -> {
		    return "hello";
		};
		BinaryOperator<String> binary = (s1, s2) -> "honalulu";
		Comparator<String> comp = Comparator.comparing(Function.identity());
	};
}
