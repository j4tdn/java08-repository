package Declaration;

import Bean.Item;

public class Ex01 {
	public static void main(String[] args) {
		
		int[] a = new int[5]; // 5 phan tu gia tri 0
		
		String[] b = new String[5]; // 5 phan tu bang null 
		
		String[] c = {"a", "b", "c"};
		
		System.out.println(c.getClass());
		
		// Trong java , mang la mot kieu doi tuong
		// array is an object 
		
		Item[] item  = new Item[3];
		
		item[0] = new Item();
		
		item[0].setId(10);
		
		item[0].setName("Fan");

		
		
	}
}
