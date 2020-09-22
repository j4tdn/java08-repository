package declaration;

import bean.Item;

public class Ex01 {
    public static void main( String[] args ) {
        int[] a = new int[5];
        String[] b = new String[5];
        String[] c = {"a", "b", "c"};
        
        // array is an object
        System.out.println("Class c: " + c.getClass());
        System.out.println("Class a: " + a.getClass());
        
        Item[] items = new Item[3];
        
        items[0].setId(10);
        items[0].setName("Fan");
    }
}
