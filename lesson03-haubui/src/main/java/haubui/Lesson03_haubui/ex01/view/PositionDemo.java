package haubui.Lesson03_haubui.ex01.view;

import haubui.Lesson03_haubui.ex01.bean.Circle;
import haubui.Lesson03_haubui.ex01.bean.Point;
import haubui.Lesson03_haubui.ex01.controller.PositionController;

public class PositionDemo {
	public static void main(String[] args) {

		PositionController controller = new PositionController();

		System.out.println("Nhap duong tron: ");
		Circle circle = controller.inputCircle();

		System.out.println("\nNhap toa do diem A: ");
		Point A = controller.inputPoint();

		controller.showPosition(circle, A);
	}

}