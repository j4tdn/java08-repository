package haubui.Lesson03_haubui.ex01.controller;

import java.util.Scanner;

import haubui.Lesson03_haubui.ex01.bean.Circle;
import haubui.Lesson03_haubui.ex01.bean.Point;
import haubui.Lesson03_haubui.ex01.common.Position;
import haubui.Lesson03_haubui.ex01.utils.PositionUtils;

public class PositionController {
	private Scanner sc = new Scanner(System.in);

	public Point inputPoint() {
		Point point = new Point();
		System.out.println("Nhap x: ");
		point.setX(Double.parseDouble(sc.nextLine()));
		System.out.println("Nhap y: ");
		point.setY(Double.parseDouble(sc.nextLine()));
		return point;
	}

	public Circle inputCircle() {
		System.out.println("\nNhap toa do tam: ");
		Point centre = inputPoint();
		System.out.println("Nhap ban kinh: ");
		double r = Double.parseDouble(sc.nextLine());
		return new Circle(centre, r);
	}

	public void showPosition(Circle circle, Point A) {
		Position position = PositionUtils.getPointStatusWithCircle(circle, A);
		System.out.println("Diem da cho nam " + position.value);
	}
}
