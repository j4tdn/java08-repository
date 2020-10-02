package colections.list;

import java.util.ArrayList;
import java.util.List;

public class A1 
{
    public static void main( String[] args )
    {
        // 1.4
    	// non-generic type - raw type
    	// catch errors at runtime
    	List digits = new ArrayList();
    	digits.add(1);
    	digits.add("A");
    	
    	// 1.5
    	// generic type
    	// catch errors at compile time
    	List<Integer> numbers = new ArrayList();
    	numbers.add(1);
    	//numbers.add("A");
    	
    }
}
