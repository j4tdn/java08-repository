package exercise_01.view;

import java.util.Scanner;

import exercise_01.bean.Circle;
import exercise_01.bean.Point;

public class CircleDemo {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		Circle circle = new Circle();
		Point point = new Point();
		
		System.out.println("Circle: ");
		System.out.println(" - Center: ");
		circle.getCenter().setX(sc.nextInt());
		circle.getCenter().setY(sc.nextInt());
		System.out.println(" - Radius: ");
		circle.setRadius(sc.nextDouble());
		
		System.out.println("Point: ");		
		point.setX(sc.nextInt());
		point.setY(sc.nextInt());
		
		sc.close();
		
		if (circle.checkBelongCircle(point)) 
			System.out.println("Point belongs to the Circle");
		else System.out.println("Point doesn't belong to the Circle");
		
	}
}
