package declaration;

import bean.Item;

/**
 * Hello world!
 *
 */
public class Ex01 
{
    public static void main( String[] args )
    {
    	int[] a = new int[5];
    	String[] b = new String[5];
    	String[] c = {"helo", "hi", "good bye"};
    	
    	System.out.println("c.getClass()" + c.getClass());
    	
    	Item[] items = new Item[3];
    }
}
