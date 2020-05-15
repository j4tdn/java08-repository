package view;

import bean.Box;

public class Ex01BoxView {
	public static void main(String[] args) {
       Box box1 = new Box();
       box1.setWidth(10);
       box1.setheight(20);;
       System.out.println(box1);
       System.out.println("=============");
       
       Box box2 = new Box();
       box2.setWidth(12);
       box2.setheight(43);;
       System.out.println(box2);
       System.out.println("=============");
       
       
       Box box3 = new Box(15,30);
       box3.setWidth(12);
       System.out.println(box3);
       
	}
}
