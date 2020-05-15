package view;

import bean.Box;

public class EX01BoxView {
	public static void main(String[] args) {
		
		Box box1 = new Box();
		box1.setWidth(10);
		box1.setHeight(20);
		
		Box box2 = new Box();
		box2.setWidth(11);
		box2.setHeight(22);
		
		Box box3 = new Box(223,31);
		
		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box3);
	}

}
