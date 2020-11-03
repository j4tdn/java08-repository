package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class App 
{
    public static void main( String[] args )
    {
    	//lambda: instance of functional interface
    	//anonymus function
    	//parameters
    	// ->
    	// {body} override from abstrack class
    	BinaryOperator<String> binary = (a, b) -> "abnc";
    	Comparator<String > comp = Comparator.comparing(Function.identity());
    	
    	List<String> items = Arrays.asList("x","y","xy","z");
    	
    	items.stream().filter(item -> {System.out.println("1: "+item);
    	return item.contains("y");
    	}).map(item ->{
    		System.out.println("2: "+item);
    		return item.length();
    	});
    	
    	items.stream().distinct();
    	
    	
    }
}
