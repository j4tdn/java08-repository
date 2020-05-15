package view;

import bean.Box;

public class Ex01Box {
	public static void main(String[] args) {
      //tao 100 thung hang
		Box box1=new Box();
		
		//box1
		box1.setWidth(10);
		box1.getHeight();
		
		System.out.println("Box1: "+box1.toString());
		
		//box2
		Box box2=new Box();
		box2.setWidth(3);
		box2.setHeight(5);
		
		System.out.println("Box2: "+box2.toString());
				
		//box3
		Box box3=new Box(4,6);
		System.out.println("Box3: "+box3.toString());
		
	}
}
