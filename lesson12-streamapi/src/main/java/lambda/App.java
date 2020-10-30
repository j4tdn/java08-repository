package lambda;

import java.util.Comparator;
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
    	Comparator<String > comp = (s1, s2) ->	s1.compareTo(s2);
    }
}
