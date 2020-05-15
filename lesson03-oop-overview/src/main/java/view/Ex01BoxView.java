package view;

import bean.Box;

public class Ex01BoxView {
	public static void main(String[] args) {
		//bean: pojo objects: nhung class thong thuong trong java
		//entity
		//dto
		
		
		//Tao 100 doi tuong thung hang
		Box box1 = new Box(); //null
		
		box1.setWidth(10);
		box1.setHeight(18);
		
		//System.out.println("Box1: " + box1.getWidth() + "," + box1.getHeight());
		
		//def: call toString:Object
		System.out.println("Box1: " + box1);
		System.out.println("=======");
		
		Box box2 = new Box(); //null
		
		box2.setWidth(4);
		box2.setHeight(2);
		
		System.out.println("Box2: " + box2);
		System.out.println("=======");
		
		Box box3 = new Box(9,3);
		box3.setWidth(20);
		box3 = new Box(); // thanh new Box x4 -> W:0, H:0
		box3.setHeight(99); //o nho van giu nguyen, chi thay doi gia tri
		System.out.println("Box3: " + box3);
	}
}
