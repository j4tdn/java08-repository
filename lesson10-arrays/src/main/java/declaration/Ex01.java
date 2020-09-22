package declaration;

import bean.Item;

public class Ex01 {
	public static void main(String[] args) {
		int[] a = new int[5]; // 1 tham chieu stack o a, heap co 5 phan tu mang int
								// moi phan tu trong a = 0
		String[] b = new String[5]; // 5 phan tu mac dinh la null - chua khoi tao tren heap
		String[] c = { "a", "b", "c" };

		// array is an object
		System.out.println("c class: " + c.getClass());
		System.out.println("a class: " + a.getClass());

		Item[] items = new Item[3];
		items[0].setId(10);
		items[0].setName("Fan");
	}
}
