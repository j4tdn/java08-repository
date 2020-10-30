package lambda;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class App {
	public static void main(String[] args) {
		//lambda : instance of Funcional Interface
		//anony
		//para
		// ->
		//{body}
		Runnable runnable	= () -> {
			System.out.println();
		};
		 
		Function<String, Integer> function = (String s) -> {
			return 1;
		};
		BinaryOperator<String> binaryOperator = ( s1, s2) -> "";
		
		Comparator<String> comp = (s1,s2) -> {
			return s1.compareTo(s2);
		};
	}

}
