package view;

import bean.Box;

public class Ex01BoxView {
	public static void main(String[] args) {
		//Tạo 100 đội tượng thùng hàng
		Box box1 = new Box();
		box1.setWidth(20);
		box1.setHeight(18);
		System.out.println(box1);
		System.out.println("================");
		
		Box box2 = new Box();
		box2.setWidth(1);
		box2.setHeight(3);
		System.out.println(box2);
		System.out.println("================");
		
		Box box3 = new Box(9, 3);
		box3.setWidth(20);
		box3 = new Box();
		System.out.println(box3);
	}
}
