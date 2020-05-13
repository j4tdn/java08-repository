package view;

import bean.Box;

public class Ex01BoxView {

	public static void main(String[] args) {
		//Tạo 100 đối tượng thùng hàng
		Box box1 = new Box();
		box1.setWidth(20);
		box1.setHeight(17);
		
		System.out.println(box1);
		
		System.out.println("==================");
		
		Box box2 = new Box();
		box2.setWidth(4);
		box2.setHeight(2);
		
		System.out.println(box2);
		
		Box box3 = new Box(9, 3);
		
		System.out.println(box3);
	}

}
