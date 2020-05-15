package view;

import bean1.Box;

public class Ex01BoxView {
	public static void main(String[] args) {
		Box box1 = new Box();
		box1.setWidth(10);
		box1.setHeight(5);
		System.out.println("Box: "+ box1.toString());
		
		Box box2 =new Box(10, 20);
		System.out.println(box2.toString());
		
		
	}

}
