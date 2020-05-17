package exercise_01.bean;

public class Circle {
	private Point center;
	private double radius;
	
	public Circle() {
		this.center = new Point();
	}
	
	public Circle(Point center, double radius) {	
		this.center = center;
		this.radius = radius;
	}
	
	public boolean checkBelongCircle(Point point) {
		double result = Math.pow(point.getX() - center.getX(), 2) + Math.pow(point.getY() - center.getY(), 2);
		return result <= Math.pow(this.getRadius(), 2);
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
