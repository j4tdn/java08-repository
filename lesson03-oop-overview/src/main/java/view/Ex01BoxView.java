package view;

import bean.Box;

public class Ex01BoxView {
	public static void main(String[] args) {
		//Tao 100 doi tuong trong thung hang
		Box box1 = new Box();
		box1.setWidth(10);
		box1.setHeight(20);
		//default call toString 
		System.out.println("Box1: \n" + box1);
		
		System.out.println("================");
		
		Box box2 = new Box(22, 32);
		box2.setWidth(20);
		box2.setHeight(40);
		System.out.println("Box2: \n" + box2);
		
		System.out.println("================");

	    Box box3 = new Box(9, 3);
	    box3.setWidth(20);
	    System.out.println("box3 X3: " + System.identityHashCode(box3));
		
	    box3 = new Box();
	    box3.setHeight(99);
	    System.out.println("box3 X4:" + System.identityHashCode(box3));
		System.out.println("\nbox3: \n" + box3);
		//box1.toString(); -> ko in ra ket qua
	}
}
