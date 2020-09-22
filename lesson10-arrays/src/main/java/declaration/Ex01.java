package declaration;

import bean.Item;

public class Ex01 
{
    public static void main( String[] args )
    {
    	int[] a = new int[5];// 5 phan tu 0
    	String[] b = new String[5];// 5 phan tu null
    	String[] c = {"a", "b", "c"};
    	
    	
    	// array is an object
    	
    	System.out.println("c.class"+ c.getClass());
    	System.out.println("a.class"+ c.getClass());
    	
    	Item[] item = new Item[3];
    	item[0].setId(10);
    	item[0].setName("Fan");
    }
}
