package view;

import bean.Box;

public class Ex01BoxView {
	public static void main(String[] args) {
		// Tạo 100 đối tượng thùng hàng
		Box box1 = new Box();
		box1.setWidth(17);
		box1.setHeight(18);

		// def: call toSring:Object
		System.out.println(box1);
		System.out.println("============");

		Box box2 = new Box();
		box2.setWidth(4);
		box2.setHeight(2);

		System.out.println(box2);
		System.out.println("============");
		
		Box box3 = new Box(9, 3);
		box3.setWidth(20);
		System.out.println("box3 X3: " + System.identityHashCode(box3)); // X3
		box3 = new Box();
		box3.setHeight(99);
		System.out.println("box3 X4: " + System.identityHashCode(box3)); // X3
		System.out.println(box3); // w = ?, h = ?
	}
}
