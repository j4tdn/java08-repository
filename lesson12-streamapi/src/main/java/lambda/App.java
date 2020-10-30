package lambda;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Function;

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
			
		
	}
}
