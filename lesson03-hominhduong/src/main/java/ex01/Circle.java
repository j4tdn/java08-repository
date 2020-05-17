package ex01;

public class Circle {

	private Point centerPoint;
	private double radius;

	public Circle(Point centerPoint, double radius) {
		super();
		this.centerPoint = centerPoint;
		this.radius = radius;
	}

	public Point getCenterPoint() {
		return centerPoint;
	}

	public void setCenterPoint(Point centerPoint) {
		this.centerPoint = centerPoint;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void positionOfCircle(Point point) {
		double distancePointWithCenter = ((point.getX() - this.centerPoint.getX())
				* (point.getX() - this.centerPoint.getX()))
				+ ((point.getY() - this.centerPoint.getY()) * (point.getY() - this.centerPoint.getY()));

		if (distancePointWithCenter > radius * radius) {
			System.out.println("outside");
		} else if (distancePointWithCenter == radius * radius) {
			System.out.println("inside");
		} else {
			System.out.println("onside");
		}
	}

}
