package exercise01;

public class Point {
	private double x;
	private double y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getDistance(Point point) {
		return Math.sqrt(Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2));
	}

	@Override
	public String toString() {
		return "(" +this.x + ";" + this.y +")";
	}
}
