package declaration;

import bean.Item;

public class Ex01 {
	public static void main(String[] args) {
		int[] a = new int[5];
		String[] b = new String[5];
		String[] c = {"a", "b", "c"}; //gia tri luu tren heap, kieu data doi tuong ke thua class object
		
		//array is an object
		System.out.println("c class: " + c.getClass());
		System.out.println("a class: " + a.getClass());
		
		Item[] items = new Item[3];
		items[0].setId(10);
		items[0].setName("Fan");
	}
}
 //tao 1 mang thi mac dinh cac ptu null
//item[0] = null -> chua khoi tao tren heap -> ko the set gtri