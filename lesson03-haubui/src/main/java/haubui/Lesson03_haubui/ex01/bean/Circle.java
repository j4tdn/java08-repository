package haubui.Lesson03_haubui.ex01.bean;

public class Circle {
	private Point centre;
	private double r;

	public Circle() {
	}

	public Circle(Point centre, double r) {
		this.centre = centre;
		this.r = r;
	}

	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

}
