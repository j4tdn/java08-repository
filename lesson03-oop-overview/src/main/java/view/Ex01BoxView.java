package view;

import bean.Box;

public class Ex01BoxView {
    public static void main(String[] args) {
        //Tạo 100 đối tượng thùng hàng
        Box box1 = new Box();
        box1.setWidth(10);
        box1.setHeight(18);
        System.out.println("Box1: " + box1);
        System.out.println("=================");

        Box box2 = new Box();
        box1.setWidth(4);
        box1.setHeight(2);
        System.out.println("Box2: " + box2);

        Box box3 = new Box(9,3);
        box3.setHeight(20);
        System.out.println("box3:" + System.identityHashCode(box3)); //x3
        box3 = new Box();
        System.out.println("box3:" + System.identityHashCode(box3)); //x4
        System.out.println(box3);


    }
}
