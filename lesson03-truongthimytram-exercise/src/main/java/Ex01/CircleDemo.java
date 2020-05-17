package Ex01;

import java.util.Scanner;

public class CircleDemo {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Nhập tâm đường tròn: ");
		Point center = new Point(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));
		System.out.println("Nhập bán kính đường tròn: ");
		int radius = Integer.parseInt(scanner.nextLine());
		Circle circle = new Circle(center, radius);
		System.out.println(circle.toString());
		System.out.println("Nhập 1 điểm: ");
		Point point = new Point(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));
		System.out.println(point.toString());
		CircleUtils.checkCirclePosition(point, circle);

	}

}
