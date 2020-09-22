package declaration;

import bean.Item;

public class Ex01 {
public static void main(String[] args) {
		int[] a = new int [5];// a mac dinh 0
		String[] b = new String[5];// b mac dinh null
		String[] c= {"a", "b", "c"};
		
		// array is an object
		System.out.println(c.getClass());// mang cua string => [Ljava.lang.String; 
											//trong java mang la 1 kieu doi tuong
		
		Item[] items= new Item[3];// khi khoi tao chua cap phat tren heap => k the set, chi dc khoi tao khi truy cap va cap phat den no
		items[0].setId(10);
		items[0].setName("Fan");
		
		
}
}
