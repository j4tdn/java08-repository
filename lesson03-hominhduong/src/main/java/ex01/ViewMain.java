package ex01;

public class ViewMain {
	public static void main(String[] args) {
		Point point = new Point(0, 2);
		Point centerPoint = new Point(0, 0);
		double radius = 2;
		Circle circle = new Circle(centerPoint, radius);
		circle.positionOfCircle(point);
	}
}
